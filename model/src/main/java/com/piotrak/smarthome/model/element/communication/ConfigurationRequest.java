package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Request;
import com.piotrak.smarthome.model.element.Configuration;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationRequest extends Request {

    private Configuration configuration;

}
