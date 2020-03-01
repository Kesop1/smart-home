package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Request;
import com.piotrak.smarthome.model.element.Configuration;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ConfigurationRequest extends Request {

    private Configuration configuration;

}
