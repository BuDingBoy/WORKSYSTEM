package com.lzp.domain;

import java.sql.Date;

public class WorkRecordDomain {
    private int recordID;
    private int staffID;
    private Date recordDate;
    private String completed;
    private String noCompleted;
    private String comments;

    public int getRecordID() {
        return recordID;
    }

    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public String getNoCompleted() {
        return noCompleted;
    }

    public void setNoCompleted(String noCompleted) {
        this.noCompleted = noCompleted;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
