package com.moon.controller.cms;

import com.moon.pojo.WeaveConstruction;
import com.moon.service.IWeaveConstructionService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String list(Model model) {
        //获取跟目录
        List<WeaveConstruction> constructions = iWeaveConstructionService.selectByPid(0);

        List<Object> list = new ArrayList<>();
        List<Column> allList = null;
        Integer id = null;
        String name = null;
        Integer pid = null;
        Integer gid = null;
        String gname = null;
        Integer gpid = null;

        for (WeaveConstruction obj : constructions) {
            id = obj.getwId();
            name = obj.getwName();
            pid = obj.getwPid();
            Column column = new Column();
            column.setId(id);
            column.setPid(pid);
            column.setName(name);
            list.add(column);
            List<WeaveConstruction> weaveConstructionList = iWeaveConstructionService.selectByPid(id);
            for(WeaveConstruction ction : weaveConstructionList){
                allList = new ArrayList<>();
                gid = ction.getwId();
                gname = ction.getwName();
                gpid = ction.getwPid();
                if(id == gpid){
                    column = new Column();
                    column.setId(gid);
                    column.setPid(gpid);
                    column.setName(gname);
//                    allList.add(column);
                    list.add(column);
                }

//                list.add(allList);
            }
        }
        log.info("columnList :{}",list);

        model.addAttribute("columnList",list);

        return "cms/column/mailbox";
    }

}

@Data
class Column{
    String name;
    Integer id;
    Integer pid;
}
