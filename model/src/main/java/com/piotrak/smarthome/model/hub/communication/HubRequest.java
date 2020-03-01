package com.piotrak.smarthome.model.hub.communication;

import com.piotrak.smarthome.model.Request;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HubRequest {

    @NotNull
    @ApiModelProperty(notes = "Request")
    private Request request;
}
