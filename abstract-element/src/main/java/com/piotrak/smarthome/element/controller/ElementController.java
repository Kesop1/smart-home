package com.piotrak.smarthome.element.controller;

import com.piotrak.smarthome.element.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/v1/")
@RestController
public abstract class ElementController {

//    @Value("element.name")
//    private String elementName;//TODO: inject element name to the path

    private ElementService service;

    @Autowired
    public ElementController(ElementService service) {
        this.service = service;
    }

}
