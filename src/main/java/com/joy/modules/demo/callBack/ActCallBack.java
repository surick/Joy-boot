package com.joy.modules.demo.callBack;

import com.joy.modules.activiti.dto.ProcessTaskDto;
import org.springframework.stereotype.Component;

/**
 * 类的功能描述.
 *
 * @Auther joy
 * @Date 2017/7/27
 */
@Component
public class ActCallBack {

    public void leaveBack(ProcessTaskDto processTaskDto){
        System.out.println("请假回调成功！");
    }
}
