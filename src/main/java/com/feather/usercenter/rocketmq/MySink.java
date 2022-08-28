package com.feather.usercenter.rocketmq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter.rocketmq
 * @className: MySink
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/8/27 22:20
 * @version: 1.0
 */
public interface MySink {

    String MY_INPUT="my_input";

    @Input("MY_INPUT")
    SubscribableChannel input();
}
