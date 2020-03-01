package com.piotrak.smarthome.model.element.function;

import com.piotrak.smarthome.model.element.Diagnostic;

import java.util.ArrayList;
import java.util.List;

public interface Diagnosible {

    default List<Diagnostic> getDiagnostics(){
        System.out.println("Diagnostics unavailable");
        return new ArrayList<>();
    }

    default List<String> showLogs(){
        System.out.println("Logs unavailable");
        return new ArrayList<>();
    }
}
