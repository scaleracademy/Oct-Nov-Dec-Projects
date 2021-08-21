package com.scaler.pcbuilder.core.components.cooler;

import com.scaler.pcbuilder.core.components.Cooler;

public class LiquidAIO implements Cooler {
    @Override
    public int consumedPower() {
        return 20; // TODO: make this configurable
    }
}
