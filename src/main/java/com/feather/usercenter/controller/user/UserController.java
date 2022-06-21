package com.feather.usercenter.controller.user;

import com.feather.usercenter.domain.entity.user.User;
import com.feather.usercenter.service.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: user-center
 * @package: com.feather.usercenter.controller.user
 * @className: UserController
 * @author: feather(杜雪松)
 * @description: TODO
 * @since: 2022/6/21 21:56
 * @version: 1.0
 */
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;


    @GetMapping("findById/{id}")
    public User findById(@PathVariable Integer id){
        return  this.userService.findById(id);
    }
}
