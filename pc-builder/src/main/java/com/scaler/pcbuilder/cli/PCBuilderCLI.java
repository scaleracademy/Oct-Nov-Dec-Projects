package com.scaler.pcbuilder.cli;

import com.scaler.pcbuilder.core.PC;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class PCBuilderCLI {

    @ShellMethod("Provide help about this project")
    public String build() {

        var pcBuilder = new PC.Builder();
        pcBuilder.

        return "Congrats PC is build";


    }
}
