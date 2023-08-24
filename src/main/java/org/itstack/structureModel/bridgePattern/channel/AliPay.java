package org.itstack.structureModel.bridgePattern.channel;

import org.itstack.structureModel.bridgePattern.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class AliPay extends Pay {
    private static final Logger logger = LoggerFactory.getLogger(AliPay.class);

    public AliPay(IPayMode payMode) {
        super(payMode);
    }

    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("Simulate AliPay channel payment and transfer account start. uId{} tradeId {} amount {}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("Simulate AliPay channel payment security check. uId {} tradeId {} security {}", uId, tradeId, security);
        if (!security) {
            logger.info("Simulate AliPay transfer interception!!!! uId {} tradeId {} amount {}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("Simulate AliPay channel to arrive successfully uId {} tradeId {} amount {}", uId, tradeId, amount);
        return "0000";
    }
}
