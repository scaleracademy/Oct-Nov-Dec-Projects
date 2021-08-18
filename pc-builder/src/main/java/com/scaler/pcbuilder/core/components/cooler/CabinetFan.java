package com.scaler.pcbuilder.core.components.cooler;

import com.scaler.pcbuilder.core.components.Cooler;

public class CabinetFan implements Cooler  {
    @Override
    public int consumedPower() {
        return 12; // TODO: make configurable
    }
}
