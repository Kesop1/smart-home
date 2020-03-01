package com.piotrak.smarthome.model.element.connection;

import com.piotrak.smarthome.model.element.Command;
import com.piotrak.smarthome.model.element.Configuration;
import com.piotrak.smarthome.model.element.Diagnostic;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
public abstract class Connection {

    private boolean connected;

    public void connect() throws Exception {
        throw new Exception("Not implemented");
    }

    public void disconnect() throws Exception {
        throw new Exception("Not implemented");
    }

    public void configure(Configuration configuration) throws Exception {
        throw new Exception("Not implemented");
    }

    public List<Diagnostic> diagnose() throws Exception{
        throw new Exception("Not implemented");
    }

    public void sendCommand(Command command) throws Exception {
        throw new Exception("Not implemented");
    }

    public Command receiveCommand() throws Exception {
        throw new Exception("Not implemented");
    }
}
