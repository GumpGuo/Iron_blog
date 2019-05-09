package com.guo.model;

/**
 * @ClassName： User
 * @author： 98231
 * @create： 2018-12-30 14:01
 * @desc： 用户类
 **/
public class User {
    /**
     * 用户id
     */
    private int id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 用户签名
     */
    private String sign;
    /**
     * 用户简介
     */
    private String profile;
    /**
     * 用户头像位置
     */
    private String imageAddress;
    /**
     * 用户邮箱
     */
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getImageAddress() {
        return imageAddress;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sign='" + sign + '\'' +
                ", profile='" + profile + '\'' +
                ", imageAddress='" + imageAddress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
