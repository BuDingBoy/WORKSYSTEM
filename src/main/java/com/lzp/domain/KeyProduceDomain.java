package com.lzp.domain;

public class KeyProduceDomain {
    private  int key ;
    private  String tableIdName;
    private String tableName;
    private int value;
    private String comments;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
