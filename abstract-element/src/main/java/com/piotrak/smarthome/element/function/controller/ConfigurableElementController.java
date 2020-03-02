package com.piotrak.smarthome.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.ConfigurableService;
import com.piotrak.smarthome.model.hub.communication.HubRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.validation.annotation.Validated;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

public interface ConfigurableElementController {

    ConfigurableService getConfigurableService();

    @ApiOperation(value = "Configure the element", notes = "This method will configure the element", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    default ElementResponse configureElement(
            @ApiParam(value = "HubRequest", required = true) @Validated HubRequest request){
        return ElementResponse.builder().status(INTERNAL_SERVER_ERROR).message("Method not implemented").build();
    }
}