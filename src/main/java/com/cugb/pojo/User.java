package com.cugb.pojo;

/**
 * 用户
 * @author lyq
 *
 */
public class User{
    private Integer id;

    private String email;

    private String phone;

    private String username;

    private String password;

    private String qq;

    private String createAt;

    private Integer goodsNum;

    private Integer power;

    private String lastLogin;

    private Byte status;
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt == null ? null : createAt.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin == null ? null : lastLogin.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", phone=" + phone + ", username=" + username + ", password=" + password + ", qq="
				+ qq + ", createAt=" + createAt + ", goodsNum=" + goodsNum + ", power=" + power + ", lastLogin="
				+ lastLogin + ", status=" + status + "]";
	}



    
    
}