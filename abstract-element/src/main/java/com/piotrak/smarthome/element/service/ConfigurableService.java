package com.piotrak.smarthome.element.service;

import com.piotrak.smarthome.model.element.Configuration;
import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.function.Configurable;

import javax.validation.constraints.NotNull;

public interface ConfigurableService extends Configurable {

    Connection getConnection();

    @Override
    default void configure(@NotNull Configuration configuration) throws Exception {
        checkElementFunctionality();
        getConnection().configure(configuration);
    }

    private void checkElementFunctionality() throws Exception {
        if(!isConfigurableEnabled()){
            throw new Exception("Configurable functionality not supported");
        }
    }

    boolean isConfigurableEnabled();
}
