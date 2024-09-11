package com.example.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.logger.KieRuntimeLogger;

public class DebuggingTest {
    public static void main(String[] args) {
        // Load KieServices and KieContainer
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Create a stateful Kie session
        KieSession kSession = kContainer.newKieSession("debuggingKSession");

        // Create a runtime logger to generate an audit log file
        KieRuntimeLogger logger = KieServices.Factory.get().getLoggers().newFileLogger(kSession, "audit");

        // Create a new order with a total amount of 120
        Order order = new Order("Order-001", 120);
        kSession.insert(order);  // Insert the order into the session

        // Fire all rules
        kSession.fireAllRules();

        // Dispose of the session
        kSession.dispose();

        // Close the logger to ensure the log file is saved
        logger.close();
    }
}
