package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Response;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ElementResponse {

    javax.ws.rs.core.Response.Status status;
    String message;
    private Response response;

}
