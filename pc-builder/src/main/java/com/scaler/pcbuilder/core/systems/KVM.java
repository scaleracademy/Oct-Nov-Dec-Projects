package com.scaler.pcbuilder.core.systems;

import com.scaler.pcbuilder.core.peripherals.Display;
import com.scaler.pcbuilder.core.peripherals.Keyboard;
import com.scaler.pcbuilder.core.peripherals.Mouse;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class KVM {
    private Keyboard keyboard;
    private Display display;
    private Mouse mouse;


    public static class Builder {
        private Keyboard keyboard;
        private Display display;
        private Mouse mouse;

        public Builder withKeyboard(Keyboard keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder withDisplay(Display display) {
            this.display = display;
            return this;
        }

        public Builder withMouse(Mouse mouse) {
            this.mouse = mouse;
            return this;
        }

        public KVM build() {
            if (display == null) throw new IllegalStateException("KVM with no display being built");
            if (keyboard == null) throw new IllegalStateException("KVM with no keyboard being built");
            return new KVM(keyboard, display, mouse);
        }
    }


}
