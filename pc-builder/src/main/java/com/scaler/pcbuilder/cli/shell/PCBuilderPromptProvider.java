package com.scaler.pcbuilder.cli.shell;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class PCBuilderPromptProvider implements PromptProvider {

    @Override
    public AttributedString getPrompt() {
        return new AttributedString("PC-BUILDER:>",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.RED)
        );
    }
}
