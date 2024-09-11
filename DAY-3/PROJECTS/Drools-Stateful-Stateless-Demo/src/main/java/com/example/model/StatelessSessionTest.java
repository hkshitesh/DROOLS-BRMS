package com.example.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

public class StatelessSessionTest {
    public static void main(String[] args) {
        // Load the KieServices and get the KieContainer
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Create a stateless Kie session
        StatelessKieSession kSession = kContainer.newStatelessKieSession("statelessOrderKSession");

        // Create an order with a total amount of 80
        Order order = new Order("Order-001", 80);

        // Execute the rules first time
        System.out.println("First execution (stateless):");
        kSession.execute(order);
        System.out.println("Order status after first execution: " + (order.isValid() ? "Valid" : "Invalid"));

        // Modify the order total and try again
        order.setValid(false);
        order.setTotalAmount(150);

        // Execute the rules a second time
        System.out.println("\nSecond execution (stateless):");
        kSession.execute(order);
        System.out.println("Order status after second execution: " + (order.isValid() ? "Valid" : "Invalid"));
    }
}
