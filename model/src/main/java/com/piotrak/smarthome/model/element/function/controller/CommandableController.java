package com.piotrak.smarthome.model.element.function.controller;

import com.piotrak.smarthome.model.element.communication.CommandRequest;
import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.model.element.service.CommandableService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;
import static javax.ws.rs.core.Response.Status.OK;

public interface CommandableController {

    CommandableService getCommandableService();

    @ApiOperation(value = "Command the element", notes = "This method will make the element act on command", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    @RequestMapping(value = "/command", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    default ElementResponse commandElement(
            @ApiParam(value = "HubRequest", required = true) @RequestBody @Validated CommandRequest request){
        ElementResponse.ElementResponseBuilder response = ElementResponse.builder();
        try {
            getCommandableService().command(request.getCommand());
            response.status(OK).message("Command sent");
        } catch (Exception e) {
            response.status(INTERNAL_SERVER_ERROR).message(e.getMessage());
        }
        return response.build();
    }
}
