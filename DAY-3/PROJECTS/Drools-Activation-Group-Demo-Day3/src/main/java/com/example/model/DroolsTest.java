package com.example.model;

import com.example.model.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

public class DroolsTest {

    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");

            List<String> resultList = new ArrayList<>();
            kSession.setGlobal("resultList", resultList);

            // Insert Person objects
            Person john = new Person("John", 65);  // Senior citizen
            Person mary = new Person("Mary", 30);  // Adult
            Person tommy = new Person("Tommy", 12); // Child

            
            
            kSession.insert(tommy);
            kSession.insert(john);
            kSession.insert(mary);

            kSession.fireAllRules();

            for (String result : resultList) {
                System.out.println(result);
            }

            kSession.dispose();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
