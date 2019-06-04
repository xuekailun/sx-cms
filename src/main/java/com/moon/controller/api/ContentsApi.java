package com.moon.controller.api;

import ch.qos.logback.core.util.FileUtil;
import com.moon.commons.ServerResponse;
import com.moon.pojo.Contents;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IContentsService;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

@RestController
@Slf4j
public class ContentsApi {

    private final IContentsService iContentsService;

    private final IWeaveConstructionService iWeaveConstructionService;

    @Autowired
    public ContentsApi(IContentsService iContentsService, IWeaveConstructionService iWeaveConstructionService) {
        this.iContentsService = iContentsService;
        this.iWeaveConstructionService = iWeaveConstructionService;
    }

    @PostMapping("cms/contents/addimg")
    public Map demo(MultipartFile file){
//        File.separator
//        String fileName = pic.getOriginalFilename();
//        String fileType = fileName.split("[.]")[1];
        Map<String,Object> map = new HashMap<>();
        String suffx = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        log.info("fileName :{}; fileType : {}", suffx);
        String filePath = "D:\\";
        File f = new File(filePath+"123"+suffx);
        map.put("code",200);
        map.put("msg",filePath+"123"+suffx);
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
            return ServerResponse.createBySuccessMessage("添加成功");
        }
        return ServerResponse.createByError();
    }

    @GetMapping("cms/contents/delete")
    public ServerResponse delete(Integer id){
        int deleteCount = iContentsService.deleteByPrimaryKey(id);
        if(deleteCount > 0){
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }


}
