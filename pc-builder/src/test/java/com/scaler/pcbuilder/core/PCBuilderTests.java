package com.scaler.pcbuilder.core;


import com.scaler.pcbuilder.core.components.Cabinet;
import com.scaler.pcbuilder.core.components.MotherBoard;
import com.scaler.pcbuilder.core.components.PSU;
import com.scaler.pcbuilder.core.peripherals.Display;
import com.scaler.pcbuilder.core.peripherals.Keyboard;
import com.scaler.pcbuilder.core.systems.KVM;
import com.scaler.pcbuilder.core.systems.Tower;
import org.junit.jupiter.api.Test;

public class PCBuilderTests {

    @Test
    void canCreateBasicPCWithBuilder() {
        var pcBuilder = new PC.Builder()
                .withKVM(new KVM.Builder().withKeyboard(new Keyboard()).withDisplay(new Display()).build())
                .withTower(new Tower.Builder()
                        .withCabinet(new Cabinet())
                        .withMotherBoard(new MotherBoard())
                        .withPsu(new PSU())
                        .build()
                );
        var pc = pcBuilder.build();
    }
}
