package com.lzp.domain;

import java.util.PrimitiveIterator;

public class FlightPriceVendors {
    private String businessExt;
    private  Integer vppr;
    private  Integer barePrice;
    private Integer price;
    private Integer basePrice;
    private  String domain;
    private  String policyType;
    private String policyId;
    private String discount;
    private String prtag;
    private  String bprtag;
    private String cabin;
    private Integer cabinType;
    private String wrapperId;
    private String afee;
    private  String it;
    private  Integer cardType;
    private FlightTgqShowData tgqShowData;


    public FlightTgqShowData getTgqShowData() {
        return tgqShowData;
    }

    public void setTgqShowData(FlightTgqShowData tgqShowData) {
        this.tgqShowData = tgqShowData;
    }

    public String getBusinessExt() {
        return businessExt;
    }

    public void setBusinessExt(String businessExt) {
        this.businessExt = businessExt;
    }

    public Integer getVppr() {
        return vppr;
    }

    public void setVppr(Integer vppr) {
        this.vppr = vppr;
    }

    public Integer getBarePrice() {
        return barePrice;
    }

    public void setBarePrice(Integer barePrice) {
        this.barePrice = barePrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getPrtag() {
        return prtag;
    }

    public void setPrtag(String prtag) {
        this.prtag = prtag;
    }

    public String getBprtag() {
        return bprtag;
    }

    public void setBprtag(String bprtag) {
        this.bprtag = bprtag;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public Integer getCabinType() {
        return cabinType;
    }

    public void setCabinType(Integer cabinType) {
        this.cabinType = cabinType;
    }

    public String getWrapperId() {
        return wrapperId;
    }

    public void setWrapperId(String wrapperId) {
        this.wrapperId = wrapperId;
    }

    public String getAfee() {
        return afee;
    }

    public void setAfee(String afee) {
        this.afee = afee;
    }

    public String getIt() {
        return it;
    }

    public void setIt(String it) {
        this.it = it;
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }
}
