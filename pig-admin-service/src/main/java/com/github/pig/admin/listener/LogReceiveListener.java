package com.github.pig.admin.listener;

import com.github.pig.common.constant.CommonConstant;
import org.springframework.stereotype.Component;

/**
 * @author lengleng
 * @date 2017/11/17
 */
@Component
public class LogReceiveListener {
    //@RabbitHandler
    public void receive(String text) {
        System.out.println("------------------------->" + text);
    }
}
