package com.scaler.pcbuilder.core.components;

import com.scaler.pcbuilder.core.compatibilty.FormFactor;
import com.scaler.pcbuilder.core.compatibilty.FormFactors;

public abstract class MotherBoard implements FormFactor {
    @Override
    public abstract FormFactors formFactor();


    public static MotherBoard create(FormFactors formFactor) {

        return new MotherBoard() {
            @Override
            public FormFactors formFactor() {
                return formFactor;
            }
        };
    }
}
