package com.feather.usercenter.service.user;

import com.feather.usercenter.dao.user.UserMapper;
import com.feather.usercenter.domain.entity.user.User;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter.service.user
 * @className: UserService
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/6/21 21:50
 * @version: 1.0
 */
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Service
public class UserService {

    public final UserMapper userMapper;


    public User findById(Integer id){
        return  this.userMapper.selectByPrimaryKey(id);
    }
}
