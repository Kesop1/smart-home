package com.piotrak.smarthome.model.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.SwitchableService;
import com.piotrak.smarthome.model.hub.communication.HubRequest;
import org.springframework.validation.annotation.Validated;

public interface SwitchableController {

    SwitchableService getSwitchableService();

    ElementResponse getElementSwitchStatus(@Validated HubRequest request);

    ElementResponse switchElement(@Validated HubRequest request);
}
