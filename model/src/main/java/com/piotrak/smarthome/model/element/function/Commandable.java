package com.piotrak.smarthome.model.element.function;

import com.piotrak.smarthome.model.element.Command;

import javax.validation.constraints.NotNull;

public interface Commandable {

    default void command(@NotNull Command command) throws Exception{
        System.out.println(command);
        throw new Exception("Not implemented");
    }
}
