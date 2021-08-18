package com.scaler.pcbuilder.core.compatibilty;

public enum FormFactors {
    miniITX(100),
    microATX(200),
    ATX(300);

    public int size = 0;
    FormFactors(int size) {
        this.size = size;
    }
}
