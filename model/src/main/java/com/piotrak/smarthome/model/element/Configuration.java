package com.piotrak.smarthome.model.element;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@Builder
@ToString
public class Configuration {

    private Map<String, String> configuration;
}
