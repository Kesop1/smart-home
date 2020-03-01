package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Request;
import com.piotrak.smarthome.model.element.Command;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommandRequest extends Request {

    @NotNull
    @ApiModelProperty(notes = "Command")
    private Command command;
}
