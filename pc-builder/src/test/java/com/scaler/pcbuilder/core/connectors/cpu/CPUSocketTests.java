package com.scaler.pcbuilder.core.connectors.cpu;

import com.scaler.pcbuilder.core.components.cpu.AMDCPU;
import com.scaler.pcbuilder.core.components.cpu.IntelCPU;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CPUSocketTests {

    @Test
    void canConnectIntelCPUtoIntelSocket() {
        var socket = new LGA1200();
        var cpu = new IntelCPU();

        socket.connect(cpu);

    }

    @Test
    void cannotConnectIntelCPUtoAMDSocket() {
        try {
            var socket = new LGA1200();
            var cpu = new AMDCPU();

            socket.connect(cpu);
//            assertNull(socket.getCpu());
            throw new IllegalStateException("Mismatched chip vendors should have not worked");
        } catch (IllegalArgumentException iae) {
            assertEquals("Cannot connect AMD CPU to INTEL socket", iae.getMessage());
        }
    }
}
