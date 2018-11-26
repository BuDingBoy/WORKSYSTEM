package com.lzp.domain;

import java.util.List;

public class FlightInfoResult {
    private Integer code;
    private List<FlightInfo> flightInfos;
    private  String message;
    private  Integer total;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<FlightInfo> getFlightInfos() {
        return flightInfos;
    }

    public void setFlightInfos(List<FlightInfo> flightInfos) {
        this.flightInfos = flightInfos;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
