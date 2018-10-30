package com.lzp.vo;

import java.sql.Date;

public class WorkRecordVO {
    private String recordID;
    private String staffID;
    private String recordDate;
    private String content;
    private String noCompleted;
    private String title;

    public WorkRecordVO() {
    }

    public WorkRecordVO(String recordID, String staffID, String recordDate, String content, String noCompleted, String title) {
        this.recordID = recordID;
        this.staffID = staffID;
        this.recordDate = recordDate;
        this.content = content;
        this.noCompleted = noCompleted;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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



    public String getNoCompleted() {
        return noCompleted;
    }

    public void setNoCompleted(String noCompleted) {
        this.noCompleted = noCompleted;
    }

}
