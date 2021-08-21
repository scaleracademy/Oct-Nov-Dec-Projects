package com.scaler.pcbuilder.core.vendors;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Vendors {

    ChipVendor chip();
    BoardVendor board() default BoardVendor.GENERIC;
}
