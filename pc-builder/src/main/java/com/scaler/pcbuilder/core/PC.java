package com.scaler.pcbuilder.core;

import com.scaler.pcbuilder.core.components.Cabinet;
import com.scaler.pcbuilder.core.components.KVM;
import com.scaler.pcbuilder.core.components.Peripheral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PC {

    private PC() {
    }

    Cabinet cabinet;
    KVM kvm;
    List<Peripheral> peripherals;

    public static class Builder {
        private PC pc;

        public Builder() {
            pc = new PC();
        }

        public Builder setCabinet(Cabinet cabinet) {

            if (!cabinet.fullyConfigured()) {
                throw new IllegalStateException("Trying to add a cabinet not fully configured");
            }
            pc.cabinet = cabinet;
            return this;
        }

        public Builder setKVM(KVM kvm) {
            if (!kvm.fullyConfigured()) {
                throw new IllegalStateException("Trying to add a kvm not fully configured");
            }

            pc.kvm = kvm;
            return this;
        }

        public Builder addPeripherals(Peripheral... peripherals) {

            if (pc.peripherals == null) {
                pc.peripherals = new ArrayList<>();
            }
            pc.peripherals.addAll(Arrays.asList(peripherals));
            return this;
        }

        public PC build() {
            // TODO: check cabinet exists
            // TODO: check kvm exists
            // TODO: cabinet has all ports that KVM needs
            // TODO: cabinet has ports required for the peripherals

            return pc;
        }
    }

}
