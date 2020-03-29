package com.piotrak.smarthome.element.service;

import com.piotrak.smarthome.element.Element;
import com.piotrak.smarthome.model.element.connection.Connection;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Getter
@Service
public class ElementService implements CommandableService, ConfigurableService, DiagnosibleService, SwitchableService {

    @Value("${function.commandable}")
    boolean commandableEnabled = false;

    @Value("${function.configurable}")
    boolean configurableEnabled = false;

    @Value("${function.diagnosible}")
    boolean diagnosibleEnabled = false;

    @Value("${function.switchable}")
    boolean switchableEnabled = false;

    private Element element;

    private Connection connection;

    @Autowired
    public ElementService(Element element, /*@Qualifier("")*/ Connection connection) {
        this.element = element;
        this.connection = connection;
    }

    public Connection getConnection(){
        return connection;
    }

}
