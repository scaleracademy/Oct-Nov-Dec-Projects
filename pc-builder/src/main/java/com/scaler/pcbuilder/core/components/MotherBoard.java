package com.scaler.pcbuilder.core.components;

import com.scaler.pcbuilder.core.compatibilty.FormFactor;
import com.scaler.pcbuilder.core.compatibilty.FormFactors;

public class MotherBoard implements FormFactor {
    @Override
    public FormFactors formFactor() {
        return FormFactors.ATX; // TODO: make abstract and create separate impl
    }
}
