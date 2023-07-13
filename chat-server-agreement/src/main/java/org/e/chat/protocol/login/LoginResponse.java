package org.e.chat.protocol.login;

import org.e.chat.protocol.Packet;
import org.e.chat.protocol.login.dto.ChatTalkDto;
import org.e.chat.protocol.login.dto.GroupsDto;
import org.e.chat.protocol.login.dto.UserFriendDto;

import java.util.ArrayList;
import java.util.List;

public class LoginResponse extends Packet {
    /**
     * 登录反馈
     */
    private boolean success;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户头像
     */
    private String userHead;
    /**
     * 用户昵称
     */
    private String userNickName;
    /**
     * 聊天对话框数据【success is true】
     */
    private List<ChatTalkDto> chatTalkDtoList = new ArrayList<>();
    /**
     * 群组列表
     */
    private List<GroupsDto> groupsList = new ArrayList<>();
    /**
     * 好友列表
     */
    private List<UserFriendDto> userFriendList = new ArrayList<>();

    public LoginResponse(){

    }

    public LoginResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserHead() {
        return userHead;
    }

    public void setUserHead(String userHead) {
        this.userHead = userHead;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public List<ChatTalkDto> getChatTalkDtoList() {
        return chatTalkDtoList;
    }

    public void setChatTalkDtoList(List<ChatTalkDto> chatTalkDtoList) {
        this.chatTalkDtoList = chatTalkDtoList;
    }

    public List<GroupsDto> getGroupsList() {
        return groupsList;
    }

    public void setGroupsList(List<GroupsDto> groupsList) {
        this.groupsList = groupsList;
    }

    public List<UserFriendDto> getUserFriendList() {
        return userFriendList;
    }

    public void setUserFriendList(List<UserFriendDto> userFriendList) {
        this.userFriendList = userFriendList;
    }

    /**
     * 获取协议指令
     *
     * @return 指令值
     */
    @Override
    public Byte getCommand() {
        return null;
    }
}
