package com.scaler.pcbuilder.core.connectors.cpu;

import com.scaler.pcbuilder.core.components.CPU;
import com.scaler.pcbuilder.core.vendors.ChipVendor;
import com.scaler.pcbuilder.core.vendors.Vendors;
import lombok.Getter;

public abstract class CPUSocket {
    @Getter
    private CPU cpu;

    void connect(CPU cpu) {
        // vendor of CPU
        ChipVendor cpuChipVendor = cpu.getClass().getAnnotation(Vendors.class).chip();
        ChipVendor socketChipVendor = this.getClass().getAnnotation(Vendors.class).chip();

        if (cpuChipVendor != socketChipVendor) {
            throw new IllegalArgumentException("Cannot connect " + cpuChipVendor + " CPU to " + socketChipVendor + " socket");
        }

        this.cpu = cpu;
    }
}
