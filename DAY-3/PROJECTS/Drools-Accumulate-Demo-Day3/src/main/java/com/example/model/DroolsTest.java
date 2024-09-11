package com.example.model;

import com.example.model.Product;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
    public static void main(String[] args) {
        // Load the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        // Create sample products
        Product product1 = new Product("Laptop", 1500);
        Product product2 = new Product("Tablet", 300);
        Product product3 = new Product("Phone", 800);

        // Insert the products into the session
        kSession.insert(product1);
        kSession.insert(product2);
        kSession.insert(product3);

        // Fire all rules
        kSession.fireAllRules();

        // Dispose the session
        kSession.dispose();
    }
}
