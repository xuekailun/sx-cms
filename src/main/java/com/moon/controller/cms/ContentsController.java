package com.moon.controller.cms;

import com.moon.pojo.Contents;
import com.moon.service.IContentsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/contents/")
@Slf4j
public class ContentsController {

    private final IContentsService iContentsService;

    @Autowired
    public ContentsController(IContentsService iContentsService) {
        this.iContentsService = iContentsService;
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Contents> contents =  iContentsService.selectContentBy();
        model.addAttribute("contents",contents);
        log.info("contents {}",contents);
        return "cms/contents/list";
    }
}
