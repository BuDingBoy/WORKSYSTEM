package com.lzp.vo;

public class StaffVO {
    /**
     * 员工编号
     */
    private String staffID;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 员工所在机构ID
     */
    private String staffORG;
    /**
     * 登录密码
     */
    private String staffPWD;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 昵称
     */
    private  String nickname;
    /**
     * 登录名
     */
    private String loginID;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffORG() {
        return staffORG;
    }

    public void setStaffORG(String staffORG) {
        this.staffORG = staffORG;
    }

    public String getStaffPWD() {
        return staffPWD;
    }

    public void setStaffPWD(String staffPWD) {
        this.staffPWD = staffPWD;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
