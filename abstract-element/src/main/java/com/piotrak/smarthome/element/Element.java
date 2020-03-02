package com.piotrak.smarthome.element;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("element")
public class Element {

    private String name;
    private String displayName;
    private String icon;

}
