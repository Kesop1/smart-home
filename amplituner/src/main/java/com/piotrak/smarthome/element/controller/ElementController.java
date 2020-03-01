package com.piotrak.smarthome.element.controller;

import com.piotrak.smarthome.element.service.ElementService;
import com.piotrak.smarthome.model.element.function.controller.CommandableController;
import com.piotrak.smarthome.model.element.function.controller.ConfigurableController;
import com.piotrak.smarthome.model.element.function.controller.DiagnosibleController;
import com.piotrak.smarthome.model.element.function.controller.SwitchableController;
import com.piotrak.smarthome.model.element.service.CommandableService;
import com.piotrak.smarthome.model.element.service.ConfigurableService;
import com.piotrak.smarthome.model.element.service.DiagnosibleService;
import com.piotrak.smarthome.model.element.service.SwitchableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping(value = "/v1/amplituner")
@RestController
public class ElementController implements CommandableController, ConfigurableController, DiagnosibleController, SwitchableController {

    private ElementService service;

    @Autowired
    public ElementController(ElementService service) {
        this.service = service;
    }

    @Override
    public CommandableService getCommandableService() {
        return service;
    }

    @Override
    public ConfigurableService getConfigurableService() {
        return service;
    }

    @Override
    public DiagnosibleService getDiagnosibleService() {
        return service;
    }

    @Override
    public SwitchableService getSwitchableService() {
        return service;
    }

}
