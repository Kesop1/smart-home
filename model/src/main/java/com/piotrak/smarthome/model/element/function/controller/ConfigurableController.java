package com.piotrak.smarthome.model.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.ConfigurableService;
import com.piotrak.smarthome.model.hub.communication.HubRequest;
import org.springframework.validation.annotation.Validated;

public interface ConfigurableController {

    ConfigurableService getConfigurableService();

    ElementResponse configureElement(@Validated HubRequest request);

}
