package com.joy.modules.demo.controller;
import com.joy.modules.activiti.dto.ProcessTaskDto;
import com.joy.modules.demo.entity.BaoxiaoEntity;
import com.joy.modules.demo.entity.LeaveEntity;
import com.joy.modules.demo.service.BaoxiaoService;
import com.joy.modules.demo.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * 流程相关的业务根据业务id查询公共类，路径为actKey，也就是业务key
 *
 */
@RequestMapping("act/busInfo")
@Controller
public class ActBusInfoController {

    @Autowired
    @Qualifier("leaveService")
    LeaveService leaveService;
    @Autowired
    @Qualifier("baoxiaoService")
    BaoxiaoService baoxiaoService;

    @RequestMapping(value ="leave",method = RequestMethod.POST)
    public String leave(ProcessTaskDto processTaskDto, Model model, String flag){
        LeaveEntity leaveEntity = leaveService.queryObject(processTaskDto.getBusId());
        model.addAttribute("leave",leaveEntity);
        model.addAttribute("taskDto",processTaskDto);
        model.addAttribute("flag",flag);
        return "/demo/leaveActInfo";
    }

    @RequestMapping(value = "baoxiao",method = RequestMethod.POST)
    public String baoxiao(ProcessTaskDto processTaskDto,Model model,String flag){
        BaoxiaoEntity baoxiaoEntity = baoxiaoService.queryObject(processTaskDto.getBusId());
        model.addAttribute("baoxiao",baoxiaoEntity);
        model.addAttribute("taskDto",processTaskDto);
        model.addAttribute("flag",flag);
        return "/demo/baoxiaoActInfo";
    }
}
