package com.scaler.pcbuilder.core.compatibilty;

import java.util.List;

public interface CompositePowerConsumer extends PowerConsumer {

    List<PowerConsumer> getChildPowerConsumers();

    int selfConsumedPower();

    @Override
    default int consumedPower() {
        int consumedPower = selfConsumedPower();
        consumedPower += getChildPowerConsumers().stream().mapToInt(PowerConsumer::consumedPower).sum();
        return consumedPower;
    }
}
