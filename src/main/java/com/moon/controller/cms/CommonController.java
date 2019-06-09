package com.moon.controller.cms;

import com.moon.pojo.FriendlyLink;
import com.moon.pojo.WebSiteSetting;
import com.moon.service.IFriendlyLinkService;
import com.moon.service.IWebSiteSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.nio.file.Path;

@Controller
public class CommonController {

    private final IFriendlyLinkService yqService;

    private final IWebSiteSettingService webSiteSettingService;

    @Autowired
    public CommonController(IFriendlyLinkService yqService, IWebSiteSettingService webSiteSettingService) {
        this.yqService = yqService;
        this.webSiteSettingService = webSiteSettingService;
    }

    //日志跳转界面显示
    @GetMapping("/cms/operation/{path}")
    public String logList(@PathVariable("path") String path){
        return "cms/operation/"+path;
    }

    //友情连接跳转界面显示
    @GetMapping("/cms/fl/{path}")
    public String flList(@PathVariable("path") String path){
        return "cms/fl/"+path;
    }
    //站点设置
    @GetMapping("/cms/ws/{path}")
    public String setting(@PathVariable("path") String path){
        return "cms/ws/"+path;
    }

    //站点设置 修改界面
    @GetMapping("/cms/ws/update/{id}")
    public String webSiteUpdate(@PathVariable("id") Integer id, Model model){
        WebSiteSetting webSiteSetting = webSiteSettingService.selectByPrimaryKey(id);
        model.addAttribute("webSite",webSiteSetting);
        return "cms/ws/update";
    }

    // 修改界面
    @GetMapping("/cms/fl/update/{id}")
    public String yqUpdate(@PathVariable("id") Integer id, Model model){

        FriendlyLink friendlyLink  = yqService.selectByPrimaryKey(id);
        model.addAttribute("friendlyLink",friendlyLink);
        return "cms/fl/update";
    }
}
