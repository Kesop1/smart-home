package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Request;
import com.piotrak.smarthome.model.element.SwitchStatus;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SwitchRequest extends Request {

    private SwitchStatus switchStatus;
}
