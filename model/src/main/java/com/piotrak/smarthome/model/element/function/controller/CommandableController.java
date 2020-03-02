package com.piotrak.smarthome.model.element.function.controller;

import com.piotrak.smarthome.model.element.communication.CommandRequest;
import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.CommandableService;
import org.springframework.validation.annotation.Validated;

public interface CommandableController {

    CommandableService getCommandableService();

    ElementResponse commandElement(@Validated CommandRequest request);
}
