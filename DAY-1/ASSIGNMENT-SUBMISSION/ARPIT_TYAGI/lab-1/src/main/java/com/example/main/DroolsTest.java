package com.example.main;

import com.example.helpers.DataHalper;
import com.example.model.Customer;
import org.kie.api.KieServices;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var customer = Customer.builder().name(DataHalper.getRandomName()).membership("Premium").build();
        kSession.insert(customer);

        kSession.fireAllRules();

        System.out.println(customer);

        kSession.dispose();
    }
}
