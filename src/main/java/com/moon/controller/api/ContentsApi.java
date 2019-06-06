package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.Contents;
import com.moon.pojo.OperationLog;
import com.moon.service.IContentsService;
import com.moon.service.IOperationLogService;
import com.moon.service.IWeaveConstructionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;

@RestController
@Slf4j
public class ContentsApi {

    private final IContentsService iContentsService;

    private final IWeaveConstructionService iWeaveConstructionService;

    private final IOperationLogService logService;

    @Autowired
    public ContentsApi(IContentsService iContentsService, IWeaveConstructionService iWeaveConstructionService, IOperationLogService logService) {
        this.iContentsService = iContentsService;
        this.iWeaveConstructionService = iWeaveConstructionService;
        this.logService = logService;
    }

    @PostMapping("cms/contents/addimg")
    public Map demo(MultipartFile file){
        Map<String,Object> map = new HashMap<>();
        String suffx = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        log.info("fileName :{}; fileType : {}", suffx);
        String filePath = "D:\\OTA\\";
        File f = new File(filePath+"123"+suffx);
        map.put("code",200);
        map.put("msg","/OTA/123"+suffx);
        try {
            file.transferTo(f);
        }catch (Exception e){
            e.printStackTrace();
        }

        return map;
    }

    @GetMapping("contents/list")
    public Map list(String id){
        List<Contents> contents = null;


        if(StringUtils.isEmpty(id) || id.equals("null")){
            contents = iContentsService.selectContentBy(null);
        }else{
            Integer wcid = Integer.parseInt(id);
            contents = iContentsService.selectContentBy(wcid == 1 ? null : wcid);
        }

        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","操作成功");
        map.put("data", contents);
        map.put("count", contents.size());
        return map;
    }

    @PostMapping("cms/contents/modification")
    public ServerResponse insert(@RequestBody Contents reqBody){
        reqBody.setInsertdate(new Date());
        int addcount = iContentsService.insertSelective(reqBody);
        if(addcount > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("增加文章");
            obj.setContent("title="+reqBody.getTitle());
            logService.insertSelective(obj);
            return ServerResponse.createBySuccessMessage("添加成功");
        }
        return ServerResponse.createByError();
    }

    @GetMapping("cms/contents/delete")
    public ServerResponse delete(Integer id){
        int deleteCount = iContentsService.deleteByPrimaryKey(id);
        if(deleteCount > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("删除文章");
            obj.setContent("id="+id);
            logService.insertSelective(obj);
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }


}
