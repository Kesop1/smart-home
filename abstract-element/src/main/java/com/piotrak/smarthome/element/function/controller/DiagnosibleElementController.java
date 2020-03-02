package com.piotrak.smarthome.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.DiagnosibleService;
import com.piotrak.smarthome.model.hub.communication.HubRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.validation.annotation.Validated;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

public interface DiagnosibleElementController {

    DiagnosibleService getDiagnosibleService();

    @ApiOperation(value = "Diagnose the element", notes = "This method will return the element's diagnostics", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    default ElementResponse diagnoseElement(
            @ApiParam(value = "HubRequest", required = true) @Validated HubRequest request){
        return ElementResponse.builder().status(INTERNAL_SERVER_ERROR).message("Method not implemented").build();
    }

    @ApiOperation(value = "Show the element's logs", notes = "This method will return the element's logs", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    default ElementResponse showLogs(
            @ApiParam(value = "HubRequest", required = true) @Validated HubRequest request){
        return ElementResponse.builder().status(INTERNAL_SERVER_ERROR).message("Method not implemented").build();
    }
}
