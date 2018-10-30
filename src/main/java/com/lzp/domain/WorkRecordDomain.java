package com.lzp.domain;

import java.util.Date;

public class WorkRecordDomain {
    private int recordID;
    private int staffID;
    private Date recordDate;
    private String content;
    private String noCompleted;
    private String title;

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



    public String getNoCompleted() {
        return noCompleted;
    }

    public void setNoCompleted(String noCompleted) {
        this.noCompleted = noCompleted;
    }


}
