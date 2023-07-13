package org.e.chat.application;

import org.e.chat.domain.user.model.TalkBoxInfo;
import org.e.chat.domain.user.model.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 登录校验
     *
     * @param userId       用户ID
     * @param userPassword 用户密码
     * @return 登录状态
     */
    boolean checkAuth(String userId, String userPassword);

    /**
     * 查询用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    UserInfo queryUserInfo(String userId);

    /**
     * 查询用户群组ID集合
     *
     * @param userId 用户ID
     * @return 用户群组ID集合
     */
    List<String> queryUserGroupsIdList(String userId);

    /**
     * 查询个人用户对话框列表
     *
     * @param userId 个人用户ID
     * @return 对话框列表
     */
    List<TalkBoxInfo> queryTalkBoxInfoList(String userId);
}
