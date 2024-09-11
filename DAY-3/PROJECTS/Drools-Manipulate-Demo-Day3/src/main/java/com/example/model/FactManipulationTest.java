package com.example.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class FactManipulationTest {
    public static void main(String[] args) {
        // Load KieServices and KieContainer
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Create a stateful Kie session
        KieSession kSession = kContainer.newKieSession("factManipulationKSession");

        // Create a new order with a total amount of 150
        Order order = new Order("Order-001", 150);
        kSession.insert(order);  // Insert the order into the session

        // Fire all rules
        kSession.fireAllRules();

        // Dispose of the session
        kSession.dispose();
    }
}
