package com.joy.modules.demo.controller;

import com.joy.modules.activiti.entity.ExtendActModelEntity;
import com.joy.modules.activiti.service.ExtendActModelerService;
import com.joy.modules.common.page.Page;
import com.joy.modules.common.utils.Utils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("demo/sum")
@Controller
public class SumController {
    @Autowired
    ExtendActModelerService extendActModelService;

    @RequestMapping("list")
    @RequiresPermissions("act:model:all")
    public String list(Model model, ExtendActModelEntity actModelEntity, HttpServletRequest request){
        int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
        Page<ExtendActModelEntity> page = extendActModelService.findPage(actModelEntity, pageNum);
        model.addAttribute("page",page);
        model.addAttribute("model",actModelEntity);
        return "demo/sum";
    }
}
