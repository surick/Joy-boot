package com.joy.modules.demo.controller;

import com.joy.modules.activiti.entity.ExtendActModelEntity;
import com.joy.modules.activiti.service.ExtendActModelerService;
import com.joy.modules.common.page.Page;
import com.joy.modules.common.utils.JsonUtil;
import com.joy.modules.common.utils.Utils;
import com.joy.modules.demo.service.SumService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("demo/sum")
@Controller
public class SumController {
    @Autowired
    ExtendActModelerService extendActModelService;
    @Autowired
    SumService sumService;

    @RequestMapping("list")
    @RequiresPermissions("act:model:all")
    public String list(Model model, ExtendActModelEntity actModelEntity, HttpServletRequest request){
        int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
        Page<ExtendActModelEntity> page = extendActModelService.findPage(actModelEntity, pageNum);
        model.addAttribute("page",page);
        model.addAttribute("model",actModelEntity);
        return "demo/sum";
    }

    @RequestMapping("record")
    public String record(@RequestParam(value = "modelName",required = false) String modelName) throws Exception {
        return "demo/record";
    }

    @RequestMapping("recordList")
    public String recordList(Model model, @RequestParam(value = "modelName",required = false) String modelName, String busId, HttpServletRequest request){
        int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
        Map<String,Object> params = new HashMap<>();
        params.put("modelName",modelName);
        params.put("busId",busId);
        Page<ExtendActModelEntity> page = sumService.recordList(params, pageNum);
        model.addAttribute("page",page);
        model.addAttribute("code",modelName);
        model.addAttribute("busId",busId);
        return "demo/recordList";
    }
}
