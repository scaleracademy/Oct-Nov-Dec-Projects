package com.scaler.pcbuilder.core;

import com.scaler.pcbuilder.core.systems.Tower;
import com.scaler.pcbuilder.core.systems.KVM;
import com.scaler.pcbuilder.core.peripherals.Peripheral;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class PC {

    private PC() {
    }

    Tower tower;
    KVM kvm;
    List<Peripheral> peripherals;

    public static class Builder {
        Tower tower;
        KVM kvm;
        List<Peripheral> peripherals;

        public Builder withTower(Tower tower) {
            this.tower = tower;
            return this;
        }

        public Builder withKVM(KVM kvm) {
            this.kvm = kvm;
            return this;
        }

        public Builder addPeripherals(Peripheral... peripherals) {

            if (this.peripherals == null) {
                this.peripherals = new ArrayList<>();
            }
            this.peripherals.addAll(Arrays.asList(peripherals));
            return this;
        }

        public Builder clearPeripherals() {
            if (this.peripherals != null) {
                this.peripherals.clear();
            }
            return this;
        }

        public PC build() {
            var pc = new PC(tower, kvm, peripherals);
            // TODO: check tower exists
            // TODO: check kvm exists
            // TODO: tower has all ports that KVM needs
            // TODO: tower has ports required for the peripherals

            return pc;
        }
    }

}
