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
@RequestMapping("column/")
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
    @GetMapping("/list")
    public String list(Model model, HttpSession session) {

        /* 获取树*/
        List list = iWeaveConstructionService.getColumns();
        model.addAttribute("columnList",list);
        session.setAttribute("treeList",list);
        return "cms/column/mailbox";
    }

    /***
     * 添加栏目页面
     * @return
     */
    @GetMapping("/add")
    public String addColumn(Model model, HttpSession session,Integer id){
        model.addAttribute("columnList",session.getAttribute("treeList"));

        WeaveConstruction ction = iWeaveConstructionService.selectById(id);

        model.addAttribute("wName",ction.getwName());
        model.addAttribute("wId",id);
        // 通过传来的id 进行判断 如果没有子节点就进行添加操作
        List<WeaveConstruction> constructions = null;
        if(!StringUtils.isEmpty(id.toString())){
            constructions = iWeaveConstructionService.selectByPid(id);
        }

        if(constructions.size() > 0){
            return "cms/column/mailbox";
        }

        return "cms/column/insert";
    }

}


