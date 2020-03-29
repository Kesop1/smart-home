package com.piotrak.smarthome.model.element.function;

import com.piotrak.smarthome.model.element.SwitchStatus;

import javax.validation.constraints.NotNull;

public interface Switchable {

    default SwitchStatus getElementSwitchStatus() throws Exception{
        System.out.println("SwitchStatus unavailable");
        throw new Exception("Not implemented");
    }

    default void switchElement(@NotNull SwitchStatus switchStatus) throws Exception {
        System.out.println(switchStatus);
        throw new Exception("Not implemented");
    }
}
