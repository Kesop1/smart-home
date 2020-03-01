package com.piotrak.smarthome.model.element.service;

import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.function.Diagnosible;

public interface DiagnosibleService extends Diagnosible {

    Connection getConnection();

}
