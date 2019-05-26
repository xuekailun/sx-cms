package com.moon.controller.cms;

import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/***
 * 组织架构
 */
@Controller
@RequestMapping("cms/column/")
@Slf4j
public class WeaveConstructionController {

    @Autowired
    private IWeaveConstructionService iWeaveConstructionService;

    @GetMapping("demo")
    public String demo() {
        return "hello word!";
    }


    /**
     * 查询出所有的部门架构
     * @return
     */
    @GetMapping("list")
    public String list(Model model, HttpSession session) {

        /* 获取树*/
        List list = iWeaveConstructionService.getColumns();
        model.addAttribute("columnList",list);
        session.setAttribute("treeList",list);
        log.info("listSize {}",list.size());
        model.addAttribute("listSize",list.size()-1);
        return "cms/column/mailbox";
    }

    /***
     * 添加栏目页面
     * @return
     */
    @GetMapping("add")
    public String addColumn(Model model, HttpSession session,Integer id){

        List list = (List) session.getAttribute("treeList");
        if(list == null){
            list = iWeaveConstructionService.getColumns();
        }
        model.addAttribute("columnList",list);

        WeaveConstruction ction = iWeaveConstructionService.selectById(id);

        model.addAttribute("wName",ction.getwName());
        model.addAttribute("wId",id);

        return "cms/column/insert";
    }


    @GetMapping("update")
    public String update(Model model, HttpSession session,Integer id){
        List list = (List) session.getAttribute("treeList");
        if(list == null){
            list = iWeaveConstructionService.getColumns();
        }
        model.addAttribute("columnList",list);
        WeaveConstruction ction = iWeaveConstructionService.selectById(id);
        model.addAttribute("ction",ction);
        WeaveConstruction parentCtion = iWeaveConstructionService.selectById(ction.getwPid());

        model.addAttribute("wName", parentCtion.getwName());
        model.addAttribute("wId",parentCtion.getwId());
        return "cms/column/update";
    }
}


