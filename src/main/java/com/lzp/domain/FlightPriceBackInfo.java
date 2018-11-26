package com.lzp.domain;

public class FlightPriceBackInfo {
    private Integer code;
    private String message;
    private Long createTime;
    private  FlightPriceResult result;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public FlightPriceResult getResult() {
        return result;
    }

    public void setResult(FlightPriceResult result) {
        this.result = result;
    }
}
