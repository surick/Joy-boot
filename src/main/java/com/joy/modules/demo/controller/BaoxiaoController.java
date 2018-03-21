package com.joy.modules.demo.controller;

import com.joy.modules.common.page.Page;
import com.joy.modules.common.utils.Result;
import com.joy.modules.common.utils.StringUtils;
import com.joy.modules.common.utils.Utils;
import com.joy.modules.demo.entity.BaoxiaoEntity;
import com.joy.modules.demo.service.BaoxiaoService;
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
import java.io.IOException;
import java.io.InputStream;

@RequestMapping("demo/baoxiao")
@Controller
public class BaoxiaoController {
    @Autowired
    BaoxiaoService baoxiaoService;

    /**
     * 报销列表
     * @param model
     * @param baoxiaoEntity
     * @param request
     * @return
     */
    @RequestMapping("list")
    @RequiresPermissions("act:model:all")
    public String list(Model model , BaoxiaoEntity baoxiaoEntity, HttpServletRequest request){
        int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
        Page<BaoxiaoEntity> page = baoxiaoService.findPage(baoxiaoEntity, pageNum);
        model.addAttribute("page",page);
        model.addAttribute("baoxiao",baoxiaoEntity);
        return "demo/baoxiao";
    }

    @RequestMapping("showfp")
    @RequiresPermissions("act:model:all")
    public String showFp(@RequestParam(value = "fp",required = false) String fp, HttpServletResponse response){
        return "demo/bxfp";
       /* try {
            byte[] bs = baoxiaoService.getBxfp(fp);
            //输出到页面
            response.getOutputStream().write(bs);
            response.getOutputStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;*/
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
    public String edit(MultipartFile fp, BaoxiaoEntity baoxiaoEntity, BindingResult bindingResult)
            throws Exception{
        byte[] fpbytes = fp.getBytes();
        baoxiaoEntity.setFp(fpbytes);
        if(StringUtils.isEmpty(baoxiaoEntity.getId())){
            baoxiaoService.save(baoxiaoEntity);
        }else {
            baoxiaoService.update(baoxiaoEntity);
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
        if(baoxiaoService.delete(id)<1){
            return Result.error("删除报销单失败");
        }
        return Result.ok("删除报销单成功");
    }
}
