package com.lzp.domain;

import java.util.List;

public class FlightTgqShowData {
    private Integer tgqFrom;
    private  String returnRule;
    private  String changeRule;
    private boolean allowChange;
    private boolean canCharge;
    private boolean canRefund;
    private boolean airlineTgq;
    private List<FlightTgqPointCharges> tgqPointCharges;

    public Integer getTgqFrom() {
        return tgqFrom;
    }

    public void setTgqFrom(Integer tgqFrom) {
        this.tgqFrom = tgqFrom;
    }

    public String getReturnRule() {
        return returnRule;
    }

    public void setReturnRule(String returnRule) {
        this.returnRule = returnRule;
    }

    public String getChangeRule() {
        return changeRule;
    }

    public void setChangeRule(String changeRule) {
        this.changeRule = changeRule;
    }

    public boolean isAllowChange() {
        return allowChange;
    }

    public void setAllowChange(boolean allowChange) {
        this.allowChange = allowChange;
    }

    public boolean isCanCharge() {
        return canCharge;
    }

    public void setCanCharge(boolean canCharge) {
        this.canCharge = canCharge;
    }

    public boolean isCanRefund() {
        return canRefund;
    }

    public void setCanRefund(boolean canRefund) {
        this.canRefund = canRefund;
    }

    public boolean isAirlineTgq() {
        return airlineTgq;
    }

    public void setAirlineTgq(boolean airlineTgq) {
        this.airlineTgq = airlineTgq;
    }

    public List<FlightTgqPointCharges> getTgqPointCharges() {
        return tgqPointCharges;
    }

    public void setTgqPointCharges(List<FlightTgqPointCharges> tgqPointCharges) {
        this.tgqPointCharges = tgqPointCharges;
    }
}
