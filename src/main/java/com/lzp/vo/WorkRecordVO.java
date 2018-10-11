package com.lzp.vo;

import java.sql.Date;

public class WorkRecordVO {
    private String recordID;
    private String staffID;
    private String recordDate;
    private String completed;
    private String noCompleted;
    private String comments;

    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(String recordDate) {
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
