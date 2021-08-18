package com.scaler.pcbuilder.core.components;

import com.scaler.pcbuilder.core.compatibilty.FormFactor;
import com.scaler.pcbuilder.core.compatibilty.FormFactors;

public abstract class Cabinet implements FormFactor {

    @Override
    public abstract FormFactors formFactor();

    public static Cabinet create (FormFactors formFactor) {
        return new Cabinet() {
            @Override
            public FormFactors formFactor() {
                return formFactor;
            }
        };
    }
}
