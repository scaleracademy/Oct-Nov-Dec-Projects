package com.scaler.pcbuilder.cli;

import com.scaler.pcbuilder.cli.shell.InputReader;
import com.scaler.pcbuilder.core.PC;
import com.scaler.pcbuilder.core.compatibility.FormFactors;
import com.scaler.pcbuilder.core.components.Cabinet;
import com.scaler.pcbuilder.core.components.MotherBoard;
import com.scaler.pcbuilder.core.components.PSU;
import com.scaler.pcbuilder.core.peripherals.Display;
import com.scaler.pcbuilder.core.peripherals.Keyboard;
import com.scaler.pcbuilder.core.systems.KVM;
import com.scaler.pcbuilder.core.systems.Tower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class PCBuilderCLI {
    @Autowired InputReader inputReader;

    @ShellMethod("Provide help about this project")
    public String build() {

        var pcBuilder = new PC.Builder()
                .withKVM(new KVM.Builder()
                        .withDisplay(new Display())
                        .withKeyboard(new Keyboard())
                        .build()
                )
                .withTower(new Tower.Builder()
                        .withCabinet(Cabinet.create(FormFactors.ATX))
                        .withMotherBoard(MotherBoard.create(FormFactors.ATX))
                        .withPsu(PSU.create(500))
                        .build()
                );

        var pc1 = pcBuilder.build();
        var pc2 = pcBuilder.build();

        System.out.println(pc1 == pc2);

        return "Congrats PC is build";


    }
}
