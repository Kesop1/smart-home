package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Request;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ElementRequest {

    private Request request;
}
