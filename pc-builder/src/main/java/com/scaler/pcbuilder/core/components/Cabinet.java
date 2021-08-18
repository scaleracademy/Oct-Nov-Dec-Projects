package com.scaler.pcbuilder.core.components;

import com.scaler.pcbuilder.core.compatibilty.FormFactor;
import com.scaler.pcbuilder.core.compatibilty.FormFactors;

public class Cabinet implements FormFactor {

    @Override
    public FormFactors formFactor() {
        return FormFactors.ATX; // TODO: abstract and separate impl
    }
}
