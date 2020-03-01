package com.piotrak.smarthome.model.element.communication;

import com.piotrak.smarthome.model.Response;
import com.piotrak.smarthome.model.element.Diagnostic;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class DiagnosticsResponse extends Response {

    private List<Diagnostic> diagnostics;
}
