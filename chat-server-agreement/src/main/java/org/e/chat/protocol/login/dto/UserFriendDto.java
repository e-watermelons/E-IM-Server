package org.e.chat.protocol.login.dto;

public class UserFriendDto {
    /**
     * 好友ID
     */
    private String friendId;
    /**
     * 好友名称
     */
    private String friendName;
    /**
     * 好友头像
     */
    private String friendHead;

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendHead() {
        return friendHead;
    }

    public void setFriendHead(String friendHead) {
        this.friendHead = friendHead;
    }
}
