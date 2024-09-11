package com.example.model;

import com.example.model.User;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
    public static void main(String[] args) {
        // Load the knowledge base
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        // Create sample users
        User user1 = new User("alice123", "alice@example.com");
        User user2 = new User("bob!", "bob@example");
        User user3 = new User("charlie", "charlie@domain");

        // Insert users into the session
        kSession.insert(user1);
        kSession.insert(user2);
        kSession.insert(user3);

        // Fire all rules
        kSession.fireAllRules();

        // Dispose the session
        kSession.dispose();
    }
}
