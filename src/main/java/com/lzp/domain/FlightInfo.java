package com.lzp.domain;

import com.lzp.abc.CarrierMap;
import org.w3c.dom.ranges.DocumentRange;

public class FlightInfo {
    private String dpt;
    private String arr;
    private String dptAirport;
    private String dptTerminal;
    private String arrAirport;
    private String arrTerminal;
    private String dptTime;
    private String  arrTime;
    private String  carrier;
    private String  flightNum;
    private String  cabin;
    private String  distance;
    private String  flightTimes;
    private  Integer arf;
    private  Integer tof;
    private String planeType;
    private String flightTypeFullName;
    private  boolean codeShare;
    private String actFlightNum;
    private  boolean stop;
    private Integer stopsNum;
    private String stopCityCode;
    private  String stopCityName;
    private String stopAirportCode;
    private  String stopAirportName;
    private String stopAirportFullName;
    private Double barePrice;
    private Double discount;
    private String tag;
    private Double bfPrice;
    private Double bfBarePrice;
    private String bfTag;
    private String carrierName;


    public String getCarrierName() {
        return CarrierMap.getCarrierMap().get(getCarrier());
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    public String getArr() {
        return arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    public String getDptAirport() {
        return dptAirport;
    }

    public void setDptAirport(String dptAirport) {
        this.dptAirport = dptAirport;
    }

    public String getDptTerminal() {
        return dptTerminal;
    }

    public void setDptTerminal(String dptTerminal) {
        this.dptTerminal = dptTerminal;
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

    public String getDptTime() {
        return dptTime;
    }

    public void setDptTime(String dptTime) {
        this.dptTime = dptTime;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getFlightTimes() {
        return flightTimes;
    }

    public void setFlightTimes(String flightTimes) {
        this.flightTimes = flightTimes;
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

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getFlightTypeFullName() {
        return flightTypeFullName;
    }

    public void setFlightTypeFullName(String flightTypeFullName) {
        this.flightTypeFullName = flightTypeFullName;
    }

    public boolean isCodeShare() {
        return codeShare;
    }

    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
    }

    public String getActFlightNum() {
        return actFlightNum;
    }

    public void setActFlightNum(String actFlightNum) {
        this.actFlightNum = actFlightNum;
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

    public Double getBarePrice() {
        return barePrice;
    }

    public void setBarePrice(Double barePrice) {
        this.barePrice = barePrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Double getBfPrice() {
        return bfPrice;
    }

    public void setBfPrice(Double bfPrice) {
        this.bfPrice = bfPrice;
    }

    public Double getBfBarePrice() {
        return bfBarePrice;
    }

    public void setBfBarePrice(Double bfBarePrice) {
        this.bfBarePrice = bfBarePrice;
    }

    public String getBfTag() {
        return bfTag;
    }

    public void setBfTag(String bfTag) {
        this.bfTag = bfTag;
    }
}
