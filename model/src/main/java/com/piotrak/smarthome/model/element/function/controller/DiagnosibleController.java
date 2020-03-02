package com.piotrak.smarthome.model.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.DiagnosibleService;
import com.piotrak.smarthome.model.hub.communication.HubRequest;
import org.springframework.validation.annotation.Validated;

public interface DiagnosibleController {

    DiagnosibleService getDiagnosibleService();

    ElementResponse diagnoseElement(@Validated HubRequest request);

    ElementResponse showLogs(@Validated HubRequest request);

}
