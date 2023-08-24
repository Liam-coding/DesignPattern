package org.itstack.structureModel.bridgePattern.mode.impl;

import org.itstack.structureModel.bridgePattern.mode.IPayMode;

public class PayCypher implements IPayMode {
    public boolean security(String uId) {
        System.out.println("Cypher pay...security check");
        return true;
    }
}
