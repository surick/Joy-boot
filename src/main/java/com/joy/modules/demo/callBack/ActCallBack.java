package com.joy.modules.demo.callBack;

import com.joy.modules.activiti.dto.ProcessTaskDto;
import org.springframework.stereotype.Component;

@Component
public class ActCallBack {

    public void leaveBack(ProcessTaskDto processTaskDto){
        System.out.println("请假回调成功！");
    }
}
