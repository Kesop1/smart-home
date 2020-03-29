package com.piotrak.smarthome.element.function.controller;

import com.piotrak.smarthome.model.element.communication.ConfigurationRequest;
import com.piotrak.smarthome.model.element.communication.ElementResponse;
import com.piotrak.smarthome.element.service.ConfigurableService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static javax.ws.rs.core.Response.Status.INTERNAL_SERVER_ERROR;

@RestController
public class ConfigurableElementController {

    private ConfigurableService configurableService;

    public ConfigurableElementController(ConfigurableService configurableService) {
        this.configurableService = configurableService;
    }

    @ApiOperation(value = "Configure the element", notes = "This method will configure the element", response = ElementResponse.class, tags = {
            "element",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ElementResponse", response = ElementResponse.class)})
    @RequestMapping(value = "/configure", method = RequestMethod.POST, produces = "application/json")
    @ResponseBody
    public ElementResponse configure(
            @ApiParam(value = "ConfigurationRequest", required = true) @Validated ConfigurationRequest request){
        return ElementResponse.builder().status(INTERNAL_SERVER_ERROR).message("Method not implemented").build();
    }
}
