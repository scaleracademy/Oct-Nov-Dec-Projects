package com.scaler.pcbuilder.core.connectors.cpu;

import com.scaler.pcbuilder.core.components.CPU;
import com.scaler.pcbuilder.core.vendors.ChipVendor;
import com.scaler.pcbuilder.core.vendors.Vendors;
import lombok.Getter;

@Vendors(chip = ChipVendor.INTEL)
public class LGA1200 extends CPUSocket {
}
