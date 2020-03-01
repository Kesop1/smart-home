package com.piotrak.smarthome.model.element.function;

import com.piotrak.smarthome.model.element.Configuration;
import com.piotrak.smarthome.model.element.connection.Connection;

import javax.validation.constraints.NotNull;

public interface Configurable {

    default void configure(@NotNull Configuration configuration, @NotNull Connection connection) throws Exception{
        System.out.println(configuration);
        System.out.println(connection);
        throw new Exception("Not implemented");
    }
}
