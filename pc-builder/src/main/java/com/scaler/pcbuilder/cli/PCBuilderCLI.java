package com.scaler.pcbuilder.cli;

import com.scaler.pcbuilder.core.PC;
import com.scaler.pcbuilder.core.systems.KVM;
import com.scaler.pcbuilder.core.systems.Tower;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class PCBuilderCLI {

    @ShellMethod("Provide help about this project")
    public String build() {

        var pcBuilder = new PC.Builder().withKVM(new KVM()).withTower(new Tower());

        var pc1 = pcBuilder.build();
        var pc2 = pcBuilder.build();

        System.out.println(pc1 == pc2);

        return "Congrats PC is build";


    }
}
