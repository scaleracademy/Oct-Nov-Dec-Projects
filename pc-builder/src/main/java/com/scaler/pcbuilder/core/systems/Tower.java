package com.scaler.pcbuilder.core.systems;

import com.scaler.pcbuilder.core.components.Cabinet;
import com.scaler.pcbuilder.core.components.MotherBoard;
import com.scaler.pcbuilder.core.components.PSU;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Tower {

    private MotherBoard motherBoard;
    private Cabinet cabinet;
    private PSU psu;


    public static final class Builder {
        private MotherBoard motherBoard;
        private Cabinet cabinet;
        private PSU psu;

        public Builder() {
        }


        public Builder withMotherBoard(MotherBoard motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public Builder withCabinet(Cabinet cabinet) {
            this.cabinet = cabinet;
            return this;
        }

        public Builder withPsu(PSU psu) {
            this.psu = psu;
            return this;
        }

        public Tower build() {
            /*
                // TODO:
                    1. check PSU power >= motherboard + cabinet power requirement
             */
            if (cabinet == null) throw new IllegalStateException("Cannot build tower without a cabinet");
            if (motherBoard == null) throw new IllegalStateException("Cannot build tower without a motherboard");
            if (psu == null) throw new IllegalStateException("Cannot build tower without a PSU");


            if (cabinet.formFactor().size < motherBoard.formFactor().size) {
                throw new IllegalStateException("Cannot fit bigger motherboard in smaller cabinet");
            }

            Tower tower = new Tower(motherBoard, cabinet, psu);
            return tower;
        }
    }
}
