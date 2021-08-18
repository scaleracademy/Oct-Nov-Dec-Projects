package com.scaler.pcbuilder.core.systems;

public class Tower {

    public boolean fullyConfigured() {
        /* TODO: add logic to check for minimum components
                    1. motherboard installed
                    2. CPU installed
                    3. RAM installed
                    4. CPU has internal GPU, or GPU is installed
                    5. At least 1 storage installed
                    6. SMPS installed (** at build() stage)
                        6.a SMPS power >= CPU+GPU power requirement
         */
        return false;
    }

    public static class Builder {
        private Tower tower;

        // TODO: installing motherboard to be mandatory first step
        //          -> replacing motherboard won't be possible
        //          -> all other installations will first check if mobo exists

        public Tower build() {
            // TODO: check fully configured logic here.
            return tower;
        }
    }
}
