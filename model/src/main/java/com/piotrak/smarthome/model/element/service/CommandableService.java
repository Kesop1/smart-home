package com.piotrak.smarthome.model.element.service;

import com.piotrak.smarthome.model.element.Command;
import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.function.Commandable;

import javax.validation.constraints.NotNull;

public interface CommandableService extends Commandable {

    Connection getConnection();

    @Override
    default void command(@NotNull Command command) throws Exception {
        getConnection().sendCommand(command);
    }

}
