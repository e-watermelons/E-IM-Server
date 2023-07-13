package org.e.chat.socket.handler;

import com.alibaba.fastjson2.JSON;
import io.netty.channel.Channel;
import org.e.chat.application.UserService;
import org.e.chat.domain.user.model.TalkBoxInfo;
import org.e.chat.domain.user.model.UserInfo;
import org.e.chat.infrastructure.common.SocketChannelUtil;
import org.e.chat.protocol.login.LoginRequest;
import org.e.chat.protocol.login.LoginResponse;
import org.e.chat.socket.MyBizHandler;

import java.util.List;

public class LoginHandler extends MyBizHandler<LoginRequest> {
    public LoginHandler(UserService userService) {
        super(userService);
    }

    @Override
    public void channelRead(Channel channel, LoginRequest msg) {
        logger.info("登录请求处理：{}", JSON.toJSONString(msg));
        // 1. 登录失败返回false
        boolean auth = userService.checkAuth(msg.getUserId(), msg.getUserPassword());
        if (!auth) {
            // 传输消息
            channel.writeAndFlush(new LoginResponse(false));
            return;
        }
        // 2. 登录成功绑定Channel
        // 2.1 绑定用户ID
        SocketChannelUtil.addChannel(msg.getUserId(), channel);
        // 2.2 绑定群组
        List<String> groupsIdList = userService.queryUserGroupsIdList(msg.getUserId());
        for (String groupId : groupsIdList) {
            SocketChannelUtil.addChannelGroup(groupId, channel);
        }
        // 3. 反馈消息：用户信息、用户对话框列表、好友列表、群组列表
        // 组装消息包
        LoginResponse loginResponse = new LoginResponse();
        // 3.1 用户信息
        UserInfo userInfo = userService.queryUserInfo(msg.getUserId());
        // 3.2 对话框
        List<TalkBoxInfo> talkBoxInfoList = userService.queryTalkBoxInfoList(msg.getUserId());

        //好友：聊天消息

        //群组：聊天消息

        // 3.3 群组

        // 3.4 好友

        loginResponse.setSuccess(Boolean.TRUE);
        loginResponse.setUserId(userInfo.getUserId());
        loginResponse.setUserNickName(userInfo.getUserNickName());
        loginResponse.setUserHead(userInfo.getUserHead());
        //传输消息
        channel.writeAndFlush(loginResponse);
    }
}
