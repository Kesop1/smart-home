package com.piotrak.smarthome.model.hub.communication;

import com.piotrak.smarthome.model.Response;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HubResponse {

    javax.ws.rs.core.Response.Status status;
    String message;
    private Response response;
}
