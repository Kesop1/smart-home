package com.piotrak.smarthome.element.service;

import com.piotrak.smarthome.element.Element;
import com.piotrak.smarthome.model.element.connection.Connection;
import com.piotrak.smarthome.model.element.service.CommandableService;
import com.piotrak.smarthome.model.element.service.ConfigurableService;
import com.piotrak.smarthome.model.element.service.DiagnosibleService;
import com.piotrak.smarthome.model.element.service.SwitchableService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Getter
public class ElementService implements CommandableService, ConfigurableService, DiagnosibleService, SwitchableService {

    private Element element;
    private Connection connection;

    @Autowired
    public ElementService(Element element, @Qualifier("mqttConnection") Connection connection) {
        this.element = element;
        this.connection = connection;
    }

    @Override
    public Connection getConnection(){
        return connection;
    }

}
