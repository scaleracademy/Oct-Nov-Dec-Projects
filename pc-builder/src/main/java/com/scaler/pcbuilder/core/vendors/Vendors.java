package com.scaler.pcbuilder.core.vendors;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Vendors {

    ChipVendor chip();
    BoardVendor board() default BoardVendor.GENERIC;
}
