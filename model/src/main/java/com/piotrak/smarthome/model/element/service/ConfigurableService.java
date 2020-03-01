package com.piotrak.smarthome.model.element.service;

import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.function.Configurable;

public interface ConfigurableService extends Configurable {

    Connection getConnection();
}
