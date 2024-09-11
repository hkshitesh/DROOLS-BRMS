package com.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TemperatureMonitoringApp {

    public static void main(String[] args) throws InterruptedException {
        // Load the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        // Create a TemperatureSensor object
        TemperatureSensor sensor = new TemperatureSensor("Sensor-1", 80.0);

        // Insert the object into the session
        kSession.insert(sensor);

        // Fire all rules
        kSession.fireAllRules();

        // Simulate a delay to observe the duration effect
        Thread.sleep(6000);

        // Fire all rules again to process any delayed rules
        kSession.fireAllRules();

        // Dispose of the session
        kSession.dispose();
    }
}
