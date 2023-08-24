package org.itstack.structureModel.bridgePattern.channel;

import org.itstack.structureModel.bridgePattern.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class WeChatPay extends Pay {
    private static final Logger logger = LoggerFactory.getLogger(WeChatPay.class);

    public WeChatPay(IPayMode payMode) {
        super(payMode);
    }

    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("Simulate WeChat channel payment and transfer account start. uId{} tradeId {} amount {}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("Simulate WeChat channel payment security check. uId {} tradeId {} security {}", uId, tradeId, security);
        if (!security) {
            logger.info("Simulate WeChat transfer interception!!!! uId {} tradeId {} amount {}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("Simulate Wechat channel to arrive successfully uId {} tradeId {} amount {}", uId, tradeId, amount);
        return "0000";
    }
}
