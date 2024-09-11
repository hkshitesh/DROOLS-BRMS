package com.example.model;

import org.drools.core.impl.KnowledgeBaseFactory;
//import org.drools.core.impl.KieBaseImpl;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
    public static void main(String[] args) {
        try {
        	 KieServices ks = KieServices.Factory.get();
             KieContainer kContainer = ks.getKieClasspathContainer();
             KieSession kSession = kContainer.newKieSession("ksession-rules");
            // Create test data
            Customer customer1 = new Customer("Alice", 150.0);
            Customer customer2 = new Customer("Bob", 90.0);
            
            // Insert data into session
            kSession.insert(customer1);
            kSession.insert(customer2);
            
            // Fire rules
            kSession.fireAllRules();
            
            kSession.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
