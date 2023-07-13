package org.e.chat.domain.user.service;

import org.e.chat.application.UserService;
import org.e.chat.domain.user.model.UserInfo;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {


    /**
     * 登录校验
     *
     * @param userId       用户ID
     * @param userPassword 用户密码
     * @return 登录状态
     */
    @Override
    public boolean checkAuth(String userId, String userPassword) {
        // 简单对比验证

        return false;
    }

    /**
     * 查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    @Override
    public UserInfo queryUserInfo(String userId) {
        return null;
    }
}
