package com.piotrak.smarthome.element.service;

import com.piotrak.smarthome.model.element.Command;
import com.piotrak.smarthome.model.element.SwitchStatus;
import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.function.Switchable;

import javax.validation.constraints.NotNull;

public interface SwitchableService extends Switchable {

    Connection getConnection();

    @Override
    default void switchElement(@NotNull SwitchStatus switchStatus) throws Exception {
        Command command = Command.builder().command(switchStatus.name()).build();
        getConnection().sendCommand(command);
    }

    private void checkElementFunctionality() throws Exception {
        if(!isSwitchableEnabled()){
            throw new Exception("Switchable functionality not supported");
        }
    }

    boolean isSwitchableEnabled();
}
