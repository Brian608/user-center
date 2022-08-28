package com.feather.usercenter.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.stereotype.Service;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter.rocketmq
 * @className: TestStreamConsumer
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/8/27 21:36
 * @version: 1.0
 */
@Service
@Slf4j
public class TestStreamConsumer {

    @StreamListener(Sink.INPUT)
    public  void  receive(String messageBody){
        log.info("通过stream收到了消息：messageBody={}",messageBody);

    }

    /**
     * 全局异常处理，发生异常的消息
     * @param message
     */
    @StreamListener("errorChannel")
    public  void  error(Message<?> message){
        ErrorMessage errorMessage= (ErrorMessage) message;
        log.error("发生异常，errorMessage={}",errorMessage);
    }

}
