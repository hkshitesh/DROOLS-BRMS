package com.example.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class OrderProcessingTimerTest {
    public static void main(String[] args) throws InterruptedException {
        // Load KieServices and KieContainer
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Create a stateful Kie session
        KieSession kSession = kContainer.newKieSession("orderKSession");

        // Create a sample order and insert it into the session
        Order order = new Order("Order-001");
        kSession.insert(order);

        // Start a new thread for firing the rules asynchronously
        new Thread(kSession::fireUntilHalt).start();

        // Simulate order processing delay
        Thread.sleep(15000);  // After 5 seconds, mark the order as processed
        order.setProcessed(true);
        kSession.update(kSession.getFactHandle(order), order);

        // Allow some time for rules to fire before shutting down
        Thread.sleep(10000);  // Wait for 10 seconds

        // Stop the rule engine
        kSession.halt();
        kSession.dispose();
    }
}
