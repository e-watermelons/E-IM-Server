package org.e.chat.protocol.login;

import org.e.chat.protocol.Command;
import org.e.chat.protocol.Packet;

public class LoginRequest extends Packet {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户密码
     */
    private String userPassword;

    public LoginRequest(String userId,String userPassword){
        this.userId = userId;
        this.userPassword = userPassword;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取协议指令
     *
     * @return 指令值
     */
    @Override
    public Byte getCommand() {
        return Command.loginRequest;
    }
}
