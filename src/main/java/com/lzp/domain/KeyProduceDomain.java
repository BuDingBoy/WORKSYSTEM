package com.lzp.domain;

import javax.persistence.Entity;

@Entity
public class KeyProduceDomain {
    private  int keyID ;
    private  String tableIdName;
    private String tableName;
    private int keyValue;
    private String comments;

    public int getKeyID() {
        return keyID;
    }

    public void setKeyID(int keyID) {
        this.keyID = keyID;
    }

    public String getTableIdName() {
        return tableIdName;
    }

    public void setTableIdName(String tableIdName) {
        this.tableIdName = tableIdName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(int keyValue) {
        this.keyValue = keyValue;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
