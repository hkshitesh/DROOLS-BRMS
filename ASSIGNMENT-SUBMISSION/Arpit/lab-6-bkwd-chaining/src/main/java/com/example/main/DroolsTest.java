package com.example.main;

import com.example.model.SmokeSensor;
import com.example.model.TemperatureSensor;
import org.kie.api.KieServices;

import java.util.List;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var temperatureSensor1 = TemperatureSensor.builder().sensorId("temperature-1").temperature(60).build();
        var temperatureSensor2 = TemperatureSensor.builder().sensorId("temperature-2").temperature(80).build();

        var smokeSensor1 = SmokeSensor.builder().sensorId("smoke-1").smokeLevel(6).build();
        var smokeSensor2 = SmokeSensor.builder().sensorId("smoke-2").smokeLevel(4).build();

        kSession.insert(temperatureSensor1);
        kSession.insert(temperatureSensor2);
        kSession.insert(smokeSensor1);
        kSession.insert(smokeSensor2);


        kSession.fireAllRules();

        kSession.getQueryResults("IsHighTemperature1").forEach(result -> {
            var temperatureSensor = (TemperatureSensor) result.get("$temperatureSensor");
            System.out.println(temperatureSensor.getSensorId());
        });

        kSession.getQueryResults("IsHighTemperature", "$temperatureSensor").forEach(result -> {
            var temperatureSensor = (TemperatureSensor) result.get("$temperatureSensor");
            System.out.println(temperatureSensor.getSensorId());
        });


        kSession.getQueryResults("IsHighSmokeLevel", "$smokeSensor").forEach(result -> {
            var temperatureSensor = (SmokeSensor) result.get("$smokeSensor");
            System.out.println(temperatureSensor.getSensorId());
        });

        kSession.dispose();
    }
}
