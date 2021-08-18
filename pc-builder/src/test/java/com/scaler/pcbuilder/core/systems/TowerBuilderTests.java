package com.scaler.pcbuilder.core.systems;

import com.scaler.pcbuilder.core.compatibilty.FormFactors;
import com.scaler.pcbuilder.core.components.Cabinet;
import com.scaler.pcbuilder.core.components.MotherBoard;
import com.scaler.pcbuilder.core.components.PSU;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TowerBuilderTests {

    @Test
    void canCreatePCTower() {
        var tower = new Tower.Builder()
                .withCabinet(Cabinet.create(FormFactors.ATX))
                .withMotherBoard(MotherBoard.create(FormFactors.ATX))
                .withPsu(new PSU())
                .build();

    }

    @Test
    void failToCreateTowerWithoutPSU() {
        try {
            var tower = new Tower.Builder()
                    .withCabinet(Cabinet.create(FormFactors.ATX))
                    .withMotherBoard(MotherBoard.create(FormFactors.ATX))
                    .build();
        } catch (IllegalStateException ise) {
            assertEquals("Cannot build tower without a PSU", ise.getMessage());
        }

    }
    @Test
    void failToCreateTowerWithoutCabinet() {
        try {
            var tower = new Tower.Builder()
                    .withMotherBoard(MotherBoard.create(FormFactors.ATX))
                    .withPsu(new PSU())
                    .build();
        } catch (IllegalStateException ise) {
            assertEquals("Cannot build tower without a cabinet", ise.getMessage());
        }

    }

    @Test
    void failToCreateTowerIfCabinetBoardSizeMismatch() {
        try {
            var tower = new Tower.Builder()
                    .withCabinet(Cabinet.create(FormFactors.microATX))
                    .withMotherBoard(MotherBoard.create(FormFactors.ATX))
                    .withPsu(new PSU())
                    .build();
        } catch (IllegalStateException ise) {
            assertEquals("Cannot fit bigger motherboard in smaller cabinet", ise.getMessage());
        }

    }
}
