package org.itstack.structureModel.bridgePattern;

import org.itstack.structureModel.bridgePattern.channel.AliPay;
import org.itstack.structureModel.bridgePattern.channel.Pay;
import org.itstack.structureModel.bridgePattern.channel.WeChatPay;
import org.itstack.structureModel.bridgePattern.mode.impl.PayFaceMode;
import org.itstack.structureModel.bridgePattern.mode.impl.PayFingerprintMode;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PayTest {
    @Test
    public void test_pay() {
        System.out.println("\r\n Simulate wechat pay and use face verification");
        Pay wxPay = new WeChatPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));
        System.out.println("\r\n Simulate AliPay and use finger verification");
        Pay zfbPay = new AliPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111", "100000109894", new BigDecimal(100));
    }
}
