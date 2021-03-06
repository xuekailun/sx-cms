package com.moon.controller.cms;

import com.moon.pojo.Contents;
import com.moon.pojo.WeaveConstruction;
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
        List list =  iContentsService.getColumns();
        List<Contents> contents = iContentsService.selectContentBy(null);
        model.addAttribute("columnList",list);
        session.setAttribute("columnList",list);
        model.addAttribute("listSize",contents.size());
        return "cms/contents/list";
    }

    @GetMapping("add")
    public String insert(Model model, HttpSession session,Integer id){
        List list = (List) session.getAttribute("columnList");
        if(list == null){
            list = iContentsService.getColumns();
        }

        List treeList = iWeaveConstructionService.standardTree();
        log.info("treeList :{}",treeList);
        model.addAttribute("standardTree",treeList);

        model.addAttribute("columnList",list);
        // 查询文章表里面的wcid 字段是否有值 如果有值 则显示列表
        WeaveConstruction ction = iWeaveConstructionService.selectById(id);
        model.addAttribute("wName",ction.getwName());
        model.addAttribute("contentId",id);

        List<Contents> contents = iContentsService.selectContentBy(id == 1 ? null : id);
        if(contents.size() > 0){
            //显示列表页
            model.addAttribute("listSize",contents.size());

            return "cms/contents/list";
        }

        return "cms/contents/insert";
    }

    @GetMapping("update")
    public String update(Model model, HttpSession session,Integer id){
        List list = (List) session.getAttribute("columnList");
        if(list == null){
            list = iContentsService.getColumns();
        }
        model.addAttribute("columnList",list);

        Contents contents = iContentsService.selectByPrimaryKey(id);
        WeaveConstruction ction = iWeaveConstructionService.selectById(contents.getWcid());
        model.addAttribute("wName", ction.getwName());

        model.addAttribute("contents", contents);
        log.info("contents {}",contents);
        return "cms/contents/update";
    }
}
