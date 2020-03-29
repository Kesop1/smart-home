package com.piotrak.smarthome.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.element.service.SwitchableService;
import com.piotrak.smarthome.model.hub.communication.HubRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

@RestController
public class SwitchableElementController {

    private SwitchableService switchableService;

    @Autowired
    public SwitchableElementController(SwitchableService switchableService) {
        this.switchableService = switchableService;
    }

    @ApiOperation(value = "Get the element's switch status", notes = "This method will show the element's switch status", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    @RequestMapping(value = "/switch/status", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public ElementResponse getElementSwitchStatus(
            @ApiParam(value = "HubRequest", required = true) @RequestBody @Validated HubRequest request){
        return ElementResponse.builder().status(INTERNAL_SERVER_ERROR).message("Method not implemented").build();
    }

    @ApiOperation(value = "Switch the element", notes = "This method will switch the element", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    @RequestMapping(value = "/switch", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ElementResponse switchElement(
            @ApiParam(value = "HubRequest", required = true) @RequestBody @Validated HubRequest request){
        return ElementResponse.builder().status(INTERNAL_SERVER_ERROR).message("Method not implemented").build();
    }
}
