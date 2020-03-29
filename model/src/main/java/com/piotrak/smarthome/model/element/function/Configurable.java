package com.piotrak.smarthome.model.element.function;

import com.piotrak.smarthome.model.element.Configuration;

import javax.validation.constraints.NotNull;

public interface Configurable {

    default void configure(@NotNull Configuration configuration) throws Exception{
        System.out.println(configuration);
        throw new Exception("Not implemented");
    }
}
