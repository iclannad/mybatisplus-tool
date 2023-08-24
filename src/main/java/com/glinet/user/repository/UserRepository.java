package com.glinet.user.service.repository;

import com.glinet.user.entity.User;
import com.glinet.user.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;


/**
* <p>
 *  表数据库访问层
 * </p>
*
* @author Clan Xie
* @since 2023-08-25
*/
@Repository
public class UserRepository extends ServiceImpl<UserMapper, User> {

}

