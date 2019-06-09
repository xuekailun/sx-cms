package com.moon.controller.api;

import com.fasterxml.jackson.datatype.jsr310.deser.InstantDeserializer;
import com.moon.commons.ServerResponse;
import com.moon.pojo.FriendlyLink;
import com.moon.pojo.OperationLog;
import com.moon.service.IFriendlyLinkService;
import com.moon.service.IOperationLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class FriendlyLinkApi {

    private final IFriendlyLinkService friendlyLinkService;

    private final IOperationLogService logService;

    @Autowired
    public FriendlyLinkApi(IFriendlyLinkService friendlyLinkService, IOperationLogService logService) {
        this.friendlyLinkService = friendlyLinkService;
        this.logService = logService;
    }

    @PostMapping("/cms/fl/add")
    public ServerResponse insert(@RequestBody FriendlyLink reqBody){

        int count = friendlyLinkService.insertSelective(reqBody);
        if(count > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("增加友情链接");
            obj.setContent("name="+reqBody.getName());
            logService.insertSelective(obj);
            return ServerResponse.createBySuccessMessage("添加成功");
        }
        return ServerResponse.createByError();
    }

    @PostMapping("/cms/fl/update")
    public ServerResponse update(@RequestBody FriendlyLink reqBody){

        int count = friendlyLinkService.updateByPrimaryKeySelective(reqBody);

        if(count > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("修改友情链接");
            obj.setContent("id="+reqBody.getId());
            logService.insertSelective(obj);
            return ServerResponse.createBySuccessMessage("修改成功");
        }
        return ServerResponse.createByError();
    }

    @GetMapping("/cms/fl/delete")
    public ServerResponse delete(Integer id){

        int count = friendlyLinkService.deleteByPrimaryKey(id);
        if(count >0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("删除友情链接");
            obj.setContent("id="+id);
            logService.insertSelective(obj);
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }

    @GetMapping("/fl/list")
    public Map list(int page, int limit){
        Map<String,Object> map = new HashMap<>();
        List<FriendlyLink> friendlyLinks = friendlyLinkService.selectByExample(page,limit);
        map.put("code","0");
        map.put("msg","SUCCESS");
        map.put("data", friendlyLinks);
        map.put("count", friendlyLinks.size());
        return map;
    }

    @PostMapping("cms/fl/addimg")
    public Map demo(MultipartFile file){
        Map<String,Object> map = new HashMap<>();
        String suffx = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        log.info("fileName :{}; fileType : {}", suffx);
        String filePath = "D:\\OTA\\";
        String imageName = Long.toString(System.currentTimeMillis());
        File f = new File(filePath+imageName+suffx);

        try {
            file.transferTo(f);
        }catch (Exception e){
            e.printStackTrace();
        }
        map.put("code",200);
        map.put("msg","/OTA/"+imageName+suffx);
        return map;
    }


}
