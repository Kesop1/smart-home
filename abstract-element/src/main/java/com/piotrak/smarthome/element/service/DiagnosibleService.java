package com.piotrak.smarthome.element.service;

import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.function.Diagnosible;

public interface DiagnosibleService extends Diagnosible {

    Connection getConnection();

    private void checkElementFunctionality() throws Exception {
        if(!isDiagnosibleEnabled()){
            throw new Exception("Diagnosible functionality not supported");
        }
    }

    boolean isDiagnosibleEnabled();

}
