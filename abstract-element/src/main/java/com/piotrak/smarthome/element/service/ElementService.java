package com.piotrak.smarthome.element.service;

import com.piotrak.smarthome.element.Element;
import com.piotrak.smarthome.model.element.connection.Connection;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Getter
public abstract class ElementService {

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
