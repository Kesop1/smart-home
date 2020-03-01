package com.piotrak.smarthome.model.element;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class Command {

    @ApiModelProperty(notes = "Command")
    private String command;
    @ApiModelProperty(notes = "Command value")
    private double commandValue;
}
