package org.itstack.structureModel.bridgePattern.channel;

import org.itstack.structureModel.bridgePattern.mode.IPayMode;

import java.math.BigDecimal;

public abstract class Pay {
    protected IPayMode payMode;
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
