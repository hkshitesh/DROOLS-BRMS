package com.example.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class StatefulSessionTest {
    public static void main(String[] args) {
        // Load the KieServices and get the KieContainer
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Create a stateful Kie session
        KieSession kSession = kContainer.newKieSession("statefulOrderKSession");

        // Create an order with a total amount of 80
        Order order = new Order("Order-001", 80);

        // Insert the order into the session
        kSession.insert(order);

        // Fire rules for the first time
        System.out.println("First execution (stateful):");
        kSession.fireAllRules();
        System.out.println("Order status after first execution: " + (order.isValid() ? "Valid" : "Invalid"));

        // Modify the order total and try again
        order.setValid(false);
        order.setTotalAmount(150);

        // Fire the rules again without inserting the order again
        System.out.println("\nSecond execution (stateful):");
        kSession.fireAllRules();
        System.out.println("Order status after second execution: " + (order.isValid() ? "Valid" : "Invalid"));

        // Dispose of the session
        kSession.dispose();
    }
}
