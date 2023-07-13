package org.e.chat.domain.user.repository;

import org.e.chat.domain.user.model.UserInfo;

public interface IUserRepository {
    /**
     * 查询用户密码
     * @param userId
     * @return
     */
    String queryUserPassword(String userId);

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    UserInfo queryUserInfo(String userId);
}
