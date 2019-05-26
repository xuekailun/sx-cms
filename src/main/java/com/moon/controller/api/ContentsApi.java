package com.moon.controller.api;

import com.moon.commons.ServerResponse;
import com.moon.pojo.Contents;
import com.moon.pojo.WeaveConstruction;
import com.moon.service.IContentsService;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
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

    @GetMapping("contents/list")
    public Map list(HttpSession session){
        List<Contents> contents =  iContentsService.selectContentBy();
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","操作成功");
        map.put("data", contents);
        map.put("count", contents.size());
        session.setAttribute("contentSize",contents.size());
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
