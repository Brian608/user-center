package com.feather.usercenter.rocketmq;

import com.feather.usercenter.dao.bonus.BonusEventLogMapper;
import com.feather.usercenter.dao.user.UserMapper;
import com.feather.usercenter.domain.dto.message.UserAddBonusMsgDTO;
import com.feather.usercenter.domain.entity.bonus.BonusEventLog;
import com.feather.usercenter.domain.entity.user.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter.rocketmq
 * @className: AddBonusListener
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/8/27 16:05
 * @version: 1.0
 */
@Service
@RocketMQMessageListener(consumerGroup = "consumer-group",topic = "add-bonus")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class AddBonusListener implements RocketMQListener<UserAddBonusMsgDTO> {

    private final UserMapper userMapper;

    private final BonusEventLogMapper bonusEventLogMapper;


    @Override
    public void onMessage(UserAddBonusMsgDTO message) {
        //收到消息的时候执行的业务

        //1.为用户加积分
        Integer userId = message.getUserId();
        Integer bonus = message.getBonus();
        User user = this.userMapper.selectByPrimaryKey(userId);
        user.setBonus(user.getBonus()+ bonus);
        this.userMapper.updateByPrimaryKey(user);

        //2。记录日志
        this.bonusEventLogMapper.insert(BonusEventLog.builder().userId(userId).value(bonus).description("投稿加积分").createTime(new Date()).event("CONTRIBUTE").build());
        log.info("积分添加完毕！");

    }
}
