package com.joy.modules.demo.controller;

import com.joy.modules.common.page.Page;
import com.joy.modules.common.utils.Result;
import com.joy.modules.common.utils.StringUtils;
import com.joy.modules.common.utils.Utils;
import com.joy.modules.demo.entity.BaoxiaoEntity;
import com.joy.modules.demo.entity.LeaveEntity;
import com.joy.modules.demo.service.BaoxiaoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author w24164
 * @create 2018-03-12 16:20
 */
@RequestMapping("demo/baoxiao")
@Controller
public class BaoxiaoController {
    @Autowired
    BaoxiaoService baoxiaoService;

    /**
     * 请假列表
     * @param model
     * @param baoxiaoEntity
     * @param request
     * @return
     */
    @RequestMapping("list")
    @RequiresPermissions("act:model:all")
    public String list(Model model , BaoxiaoEntity baoxiaoEntity, HttpServletRequest request){
        int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
        Page<LeaveEntity> page = baoxiaoService.findPage(baoxiaoEntity, pageNum);
        model.addAttribute("page",page);
        model.addAttribute("baoxiao",baoxiaoEntity);
        return "demo/baoxiao";
    }

    /**
     * 请假详情
     * @param model
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("info")
    @RequiresPermissions("act:model:all")
    public String info(Model model , String id, HttpServletRequest request){
        if(!StringUtils.isEmpty(id)){
            BaoxiaoEntity baoxiaoEntity = baoxiaoService.queryObject(id);
            model.addAttribute("baoxiao",baoxiaoEntity);
        }
        return "demo/baoxiaoEdit";
    }

    /**
     * 编辑
     * @param baoxiaoEntity
     * @return
     */
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @RequiresPermissions("act:model:all")
    @ResponseBody
    public Result edit(BaoxiaoEntity baoxiaoEntity){
        if(StringUtils.isEmpty(baoxiaoEntity.getId())){
            baoxiaoService.save(baoxiaoEntity);
        }else {
            baoxiaoService.update(baoxiaoEntity);
        }
        return Result.ok();
    }


    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @RequiresPermissions("act:model:all")
    @ResponseBody
    public Result edit(String id){
        if(baoxiaoService.delete(id)<1){
            return Result.error("删除报销单失败");
        }
        return Result.ok("删除报销单成功");
    }
}
