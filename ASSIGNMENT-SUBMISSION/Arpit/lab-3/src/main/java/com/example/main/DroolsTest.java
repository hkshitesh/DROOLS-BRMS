package com.example.main;

import com.example.model.Customer;
import org.drools.core.ObjectFilter;
import org.kie.api.KieServices;

import java.util.List;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var facts = List.of(
                Customer.builder().name("Customer 1").loyaltyPoints(500).membership("Gold").build(),
                Customer.builder().name("Customer 2").loyaltyPoints(1500).membership("Silver").build(),
                Customer.builder().name("Customer 3").loyaltyPoints(100).membership("Silver").build(),
                Customer.builder().name("Customer 4").loyaltyPoints(200).membership("Bronze").build()
        );

        facts.forEach(kSession::insert);

        kSession.fireAllRules();

        kSession.getFactHandles((ObjectFilter) o -> o instanceof Customer c && c.getName().contains("- new"))
                .stream()
                .filter(s -> !facts.contains(s))
                .forEach(System.out::println);

        kSession.dispose();
    }
}
