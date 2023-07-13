package org.e.chat.infrastructure.po;

import java.util.Date;

/**
 * 用户好友
 */
public class UserFriend {
    /**
     * 自增ID
     */
    private Long id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 好友用户ID
     */
    private String userFriendId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    public UserFriend() {
    }

    public UserFriend(String userId, String userFriendId) {
        this.userId = userId;
        this.userFriendId = userFriendId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFriendId() {
        return userFriendId;
    }

    public void setUserFriendId(String userFriendId) {
        this.userFriendId = userFriendId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
