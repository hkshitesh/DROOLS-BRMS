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

            Person mary = new Person("Mary", 45);

            //kSession.insert(john);
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
