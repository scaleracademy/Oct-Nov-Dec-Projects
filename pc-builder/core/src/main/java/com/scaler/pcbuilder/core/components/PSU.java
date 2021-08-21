package com.scaler.pcbuilder.core.components;

import com.scaler.pcbuilder.core.compatibility.PowerSupplier;

public abstract class PSU implements PowerSupplier {
    
    public static PSU create(int capacity) {
        return new PSU() {
            @Override
            public int suppliedPower() {
                return capacity;
            }
        };
    }
}
