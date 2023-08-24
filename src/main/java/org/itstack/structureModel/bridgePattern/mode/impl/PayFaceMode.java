package org.itstack.structureModel.bridgePattern.mode.impl;

import org.itstack.structureModel.bridgePattern.mode.IPayMode;

public class PayFaceMode implements IPayMode {
    public boolean security(String uId) {
        System.out.println("human face pay...security check");
        return true;
    }
}
