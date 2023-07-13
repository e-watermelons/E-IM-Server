package org.e.chat.infrastructure.dao;

import com.baomidou.mybatisplus.core.mapper.Mapper;
import org.e.chat.infrastructure.po.User;

public interface IUserDao extends Mapper<User> {
    /**
     * 查询密码
     * @param userId
     * @return
     */
    String queryUserPassword(String userId);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    User queryUserById(String userId);


}
