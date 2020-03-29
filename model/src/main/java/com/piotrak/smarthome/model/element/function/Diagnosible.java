package com.piotrak.smarthome.model.element.function;

import com.piotrak.smarthome.model.element.Diagnostic;

import java.util.List;

public interface Diagnosible {

    default List<Diagnostic> getDiagnostics() throws Exception{
        System.out.println("Diagnostics unavailable");
        throw new Exception("Not implemented");
    }

    default List<String> showLogs() throws Exception{
        System.out.println("Logs unavailable");
        throw new Exception("Not implemented");
    }
}
