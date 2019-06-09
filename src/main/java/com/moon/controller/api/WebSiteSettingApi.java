package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.FriendlyLink;
import com.moon.pojo.OperationLog;
import com.moon.pojo.WebSiteSetting;
import com.moon.service.IOperationLogService;
import com.moon.service.IWebSiteSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class WebSiteSettingApi {

    private final IWebSiteSettingService webSiteSettingService;

    private final IOperationLogService logService;

    @Autowired
    public WebSiteSettingApi(IWebSiteSettingService webSiteSettingService, IOperationLogService logService) {
        this.webSiteSettingService = webSiteSettingService;
        this.logService = logService;
    }

    @PostMapping("/cms/ws/add")
    public ServerResponse insert(@RequestBody WebSiteSetting reqBody){

        int count = webSiteSettingService.insertSelective(reqBody);
        if(count > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("增加站点设置");
            obj.setContent("name="+reqBody.getTitle());
            logService.insertSelective(obj);
            return ServerResponse.createBySuccessMessage("添加成功");
        }
        return ServerResponse.createByError();
    }


    @GetMapping("/ws/list")
    public Map list(int page, int limit){
        Map<String,Object> map = new HashMap<>();
        List<WebSiteSetting> friendlyLinks = webSiteSettingService.selectByExample(page,limit);
        map.put("code","0");
        map.put("msg","SUCCESS");
        map.put("data", friendlyLinks);
        map.put("count", friendlyLinks.size());
        return map;
    }


    @GetMapping("/cms/ws/delete")
    public ServerResponse delete(Integer id){

        int count = webSiteSettingService.deleteByPrimaryKey(id);
        if(count >0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("删除站点设置");
            obj.setContent("id="+id);
            logService.insertSelective(obj);
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByError();
    }

    @PostMapping("/cms/ws/update")
    public ServerResponse update(@RequestBody WebSiteSetting reqBody){

        int count = webSiteSettingService.updateByPrimaryKeySelective(reqBody);

        if(count > 0){
            OperationLog obj = new OperationLog();
            //todo 未添加登陆名
            obj.setCreatetime(new Date());
            obj.setTitle("修改站点设置");
            obj.setContent("id="+reqBody.getId());
            logService.insertSelective(obj);
            return ServerResponse.createBySuccessMessage("修改成功");
        }
        return ServerResponse.createByError();
    }


}
