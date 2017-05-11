package com.xiaobo.pojo;

public class User {
    @Override
	public String toString() {
		return "User [userId=" + userId + ", userLoginid=" + userLoginid + ", userUsername=" + userUsername
				+ ", userPassword=" + userPassword + ", userSex=" + userSex + ", userCollege=" + userCollege
				+ ", userClass=" + userClass + ", userPhone=" + userPhone + ", userEmail=" + userEmail
				+ ", userCreatetime=" + userCreatetime + "]";
	}

	private Integer userId;

    private Integer userLoginid;

    private String userUsername;

    private String userPassword;

    private Byte userSex;

    private String userCollege;

    private String userClass;

    private String userPhone;

    private String userEmail;

    private String userCreatetime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserLoginid() {
        return userLoginid;
    }

    public void setUserLoginid(Integer userLoginid) {
        this.userLoginid = userLoginid;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername == null ? null : userUsername.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Byte getUserSex() {
        return userSex;
    }

    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    public String getUserCollege() {
        return userCollege;
    }

    public void setUserCollege(String userCollege) {
        this.userCollege = userCollege == null ? null : userCollege.trim();
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass == null ? null : userClass.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserCreatetime() {
        return userCreatetime;
    }

    public void setUserCreatetime(String userCreatetime) {
        this.userCreatetime = userCreatetime == null ? null : userCreatetime.trim();
    }
}