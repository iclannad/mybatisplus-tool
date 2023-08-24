package com.glinet.user.controller;

import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.glinet.user.service.UserService;

/**
 *
 *  前端控制器
 *
 *
 * @author Clan Xie
 * @since 2023-08-25
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

}

