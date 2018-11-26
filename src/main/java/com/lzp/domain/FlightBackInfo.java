package com.lzp.domain;

public class FlightBackInfo {
    private Integer code;
    private Long createTime;
    private String message;
    private FlightInfoResult result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FlightInfoResult getResult() {
        return result;
    }

    public void setResult(FlightInfoResult result) {
        this.result = result;
    }
}
