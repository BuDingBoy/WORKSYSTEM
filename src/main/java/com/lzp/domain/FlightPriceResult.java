package com.lzp.domain;

import java.util.List;

public class FlightPriceResult {

    private  boolean status;
    private String msg;
    private String date;
    private String depCode;
    private String bairdrome;
    private String depAirport;
    private String depTerminal;
    private String btime;
    private String arrCode;
    private String eairdrome;
    private String arrAirport;
    private String arrTerminal;
    private String etime;
    private String carrier;
    private String com;
    private String code;
    private boolean meal;
    private boolean zhiji;
    private String correct;
    private boolean stop;
    private  Integer stopsNum;
    private String stopCityCode;
    private String stopCityName;
    private String stopAirportCode;
    private String stopAirportName;
    private String stopAirportFullName;
    private boolean codeShare ;
    private boolean shareShowAct;
    private  String actCode;
    private Integer arf;
    private  Integer tof ;
    private Integer distance;
    private String  flightType;
    private List<FlightPriceVendors> vendors;

    public List<FlightPriceVendors> getVendors() {
        return vendors;
    }

    public void setVendors(List<FlightPriceVendors> vendors) {
        this.vendors = vendors;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getBairdrome() {
        return bairdrome;
    }

    public void setBairdrome(String bairdrome) {
        this.bairdrome = bairdrome;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public void setDepAirport(String depAirport) {
        this.depAirport = depAirport;
    }

    public String getDepTerminal() {
        return depTerminal;
    }

    public void setDepTerminal(String depTerminal) {
        this.depTerminal = depTerminal;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public String getArrCode() {
        return arrCode;
    }

    public void setArrCode(String arrCode) {
        this.arrCode = arrCode;
    }

    public String getEairdrome() {
        return eairdrome;
    }

    public void setEairdrome(String eairdrome) {
        this.eairdrome = eairdrome;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public void setArrAirport(String arrAirport) {
        this.arrAirport = arrAirport;
    }

    public String getArrTerminal() {
        return arrTerminal;
    }

    public void setArrTerminal(String arrTerminal) {
        this.arrTerminal = arrTerminal;
    }

    public String getEtime() {
        return etime;
    }

    public void setEtime(String etime) {
        this.etime = etime;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isMeal() {
        return meal;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }

    public boolean isZhiji() {
        return zhiji;
    }

    public void setZhiji(boolean zhiji) {
        this.zhiji = zhiji;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public Integer getStopsNum() {
        return stopsNum;
    }

    public void setStopsNum(Integer stopsNum) {
        this.stopsNum = stopsNum;
    }

    public String getStopCityCode() {
        return stopCityCode;
    }

    public void setStopCityCode(String stopCityCode) {
        this.stopCityCode = stopCityCode;
    }

    public String getStopCityName() {
        return stopCityName;
    }

    public void setStopCityName(String stopCityName) {
        this.stopCityName = stopCityName;
    }

    public String getStopAirportCode() {
        return stopAirportCode;
    }

    public void setStopAirportCode(String stopAirportCode) {
        this.stopAirportCode = stopAirportCode;
    }

    public String getStopAirportName() {
        return stopAirportName;
    }

    public void setStopAirportName(String stopAirportName) {
        this.stopAirportName = stopAirportName;
    }

    public String getStopAirportFullName() {
        return stopAirportFullName;
    }

    public void setStopAirportFullName(String stopAirportFullName) {
        this.stopAirportFullName = stopAirportFullName;
    }

    public boolean isCodeShare() {
        return codeShare;
    }

    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
    }

    public boolean isShareShowAct() {
        return shareShowAct;
    }

    public void setShareShowAct(boolean shareShowAct) {
        this.shareShowAct = shareShowAct;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    public Integer getArf() {
        return arf;
    }

    public void setArf(Integer arf) {
        this.arf = arf;
    }

    public Integer getTof() {
        return tof;
    }

    public void setTof(Integer tof) {
        this.tof = tof;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }
}
