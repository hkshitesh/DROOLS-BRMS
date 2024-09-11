package com.example.model;

import com.example.model.Vehicle;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
    public static void main(String[] args) {
        // Load the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        // Create Vehicle objects
        Vehicle vehicle1 = new Vehicle("V001", 12000, "Active");
        Vehicle vehicle2 = new Vehicle("V002", 8000, "Active");
        Vehicle vehicle3 = new Vehicle("V003", 16000, "Active");

        // Insert Vehicle objects into the session
        kSession.insert(vehicle1);
        kSession.insert(vehicle2);
        kSession.insert(vehicle3);

        // Fire all rules
        kSession.fireAllRules();

        // Dispose the session
        kSession.dispose();
    }
}
