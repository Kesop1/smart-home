package com.piotrak.smarthome.model.element;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;


@Getter
@Builder
@ToString
public class Diagnostic {

    private String name;
    private Status status;
    private String description;
}
