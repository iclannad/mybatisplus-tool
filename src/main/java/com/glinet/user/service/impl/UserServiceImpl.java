package com.glinet.user.service.impl;

import com.glinet.user.service.UserService
import com.glinet.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Clan Xie
 * @since 2023-08-25
 */
@Service
public class UserServiceImpl  implements UserService {

    @Resource
    private UserRepository UserRepository;

}

