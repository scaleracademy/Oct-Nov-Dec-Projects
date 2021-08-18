package com.scaler.pcbuilder.core.components;

import com.scaler.pcbuilder.core.compatibilty.CompositePowerConsumer;
import com.scaler.pcbuilder.core.compatibilty.FormFactor;
import com.scaler.pcbuilder.core.compatibilty.FormFactors;
import com.scaler.pcbuilder.core.compatibilty.PowerConsumer;

import java.util.Arrays;
import java.util.List;

public abstract class Cabinet implements FormFactor, CompositePowerConsumer {

    @Override
    public abstract FormFactors formFactor();

    public static Cabinet create (FormFactors formFactor) {
        return new Cabinet() {
            @Override
            public List<PowerConsumer> getChildPowerConsumers() {
                return Arrays.asList();
            }

            @Override
            public int selfConsumedPower() {
                return 0;
            }

            @Override
            public FormFactors formFactor() {
                return formFactor;
            }
        };
    }
}
