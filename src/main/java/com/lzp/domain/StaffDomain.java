package com.lzp.domain;

public class StaffDomain {
    /**
     * 员工编号
     */
    private int staffID;
    /**
     * 员工姓名
     */
    private String staffName;
    /**
     * 员工所在机构ID
     */
    private int staffORG;
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

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffORG() {
        return staffORG;
    }

    public void setStaffORG(int staffORG) {
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

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    @Override
    public String toString() {
        return "StaffDomain{" +
                "staffID=" + staffID +
                ", staffName='" + staffName + '\'' +
                ", staffORG=" + staffORG +
                ", staffPWD='" + staffPWD + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
