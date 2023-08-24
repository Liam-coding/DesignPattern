package org.itstack.structureModel.bridgePattern.mode.impl;

import org.itstack.structureModel.bridgePattern.mode.IPayMode;

public class PayFingerprintMode implements IPayMode {
    public boolean security(String uId) {
        System.out.println("Finger pay...security check");
        return true;
    }
}
