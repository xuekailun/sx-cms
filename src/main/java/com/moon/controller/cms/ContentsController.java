package com.moon.controller.cms;

import com.moon.pojo.Contents;
import com.moon.service.IContentsService;
import com.moon.service.IWeaveConstructionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/cms/contents/")
@Slf4j
public class ContentsController {

    private final IContentsService iContentsService;
    private final IWeaveConstructionService iWeaveConstructionService;

    @Autowired
    public ContentsController(IContentsService iContentsService, IWeaveConstructionService iWeaveConstructionService) {
        this.iContentsService = iContentsService;
        this.iWeaveConstructionService = iWeaveConstructionService;
    }

    @GetMapping("list")
    public String list(Model model, HttpSession session){
        List list = (List) session.getAttribute("treeList");
        if(list == null){
            list = iContentsService.getColumns();
        }
        model.addAttribute("columnList",list);


        return "cms/contents/list";
    }

    @GetMapping("add")
    public String insert(Model model, HttpSession session){
        List list = (List) session.getAttribute("treeList");
        if(list == null){
            list = iContentsService.getColumns();
        }
        model.addAttribute("columnList",list);
        return "cms/contents/insert";
    }
}
