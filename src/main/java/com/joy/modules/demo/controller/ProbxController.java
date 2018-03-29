package com.joy.modules.demo.controller;

import com.joy.modules.common.page.Page;
import com.joy.modules.common.utils.Result;
import com.joy.modules.common.utils.StringUtils;
import com.joy.modules.common.utils.Utils;
import com.joy.modules.demo.entity.BxEntity;
import com.joy.modules.demo.service.ProbxService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 项目报销
 *
 * @author w24164
 * @create 2018-03-23 14:54
 */
@RequestMapping("demo/probx")
@Controller
public class ProbxController {
    @Autowired
    ProbxService probxService;

    /**
     * 报销列表
     * @param model
     * @param BxEntity
     * @param request
     * @return
     */
    @RequestMapping("list")
    @RequiresPermissions("act:model:all")
    public String list(Model model , BxEntity BxEntity, HttpServletRequest request){
        int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
        Page<BxEntity> page = probxService.findPage(BxEntity, pageNum);
        model.addAttribute("page",page);
        model.addAttribute("bx", BxEntity);
        return "demo/probx";
    }

    @RequestMapping("showfp")
    @RequiresPermissions("act:model:all")
    public String showFp(@RequestParam(value = "fp",required = false) String fp, HttpServletResponse response){
        return "demo/probxfp";
    }

    /**
     * 报销详情
     * @param model
     * @param id
     * @param request
     * @return
     */
    @RequestMapping("info")
    @RequiresPermissions("act:model:all")
    public String info(Model model , String id, HttpServletRequest request){
        if(!StringUtils.isEmpty(id)){
            BxEntity bxEntity = probxService.queryObject(id);
            model.addAttribute("bx",bxEntity);
        }
        return "demo/probxEdit";
    }

    /**
     * 编辑
     * @param bxEntity
     * @return
     */
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @RequiresPermissions("act:model:all")
    public String edit(MultipartFile fp,MultipartFile fp1,MultipartFile fp2,BxEntity bxEntity, BindingResult bindingResult)
            throws Exception{
        byte[] fpbytes = fp.getBytes();
        byte[] fpbytes1 = fp1.getBytes();
        byte[] fpbytes2 = fp2.getBytes();
        bxEntity.setFp(fpbytes);
        bxEntity.setFp1(fpbytes1);
        bxEntity.setFp2(fpbytes2);
        if(StringUtils.isEmpty(bxEntity.getId())){
            probxService.save(bxEntity);
        }else {
            probxService.update(bxEntity);
        }
        return "redirect:list";
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
        if(probxService.delete(id)<1){
            return Result.error("删除报销单失败");
        }
        return Result.ok("删除报销单成功");
    }

}
