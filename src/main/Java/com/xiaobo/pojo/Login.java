package com.xiaobo.pojo;

public class Login {
    private Integer loginId;

    private String loginUsername;

    private String loginPassword;

    public Integer getLoginId() {
        return loginId;
    }

    @Override
	public String toString() {
		return "Login [loginId=" + loginId + ", loginUsername=" + loginUsername + ", loginPassword=" + loginPassword
				+ "]";
	}

	public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername == null ? null : loginUsername.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }
}