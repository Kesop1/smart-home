package com.piotrak.smarthome.model.element.connection.mqtt;

import com.piotrak.smarthome.model.element.connection.Connection;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "mqttConnection")
@Getter
public class MQTTConnection extends Connection {

    private List<String> subscribeTopics;
    private List<String> publishTopics;

}
