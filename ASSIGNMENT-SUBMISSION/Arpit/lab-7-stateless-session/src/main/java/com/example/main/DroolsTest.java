package com.example.main;

import com.example.model.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;

import java.util.List;
import java.util.stream.IntStream;

public class DroolsTest {
    private static final int LOOP_TIMES = 5;

    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();

        System.out.println("\n\n=== Stateful Session ===");

        stateful(kContainer);

        System.out.println("\n\n=== Stateless Session ===");

        stateless(kContainer);
    }

    private static void stateful(KieContainer kContainer) {
        var kSession = kContainer.newKieSession("ksession-stateful-rules");

        var person1 = Person.builder().name("Alice").age(18).build();
        var person2 = Person.builder().name("Bob").age(17).build();
        var person3 = Person.builder().name("Charlie").age(26).build();


        kSession.insert(person1);
        kSession.insert(person2);
        kSession.insert(person3);

        IntStream.range(0, LOOP_TIMES).forEach( i -> {
            System.out.println("\nRound " + (i+1) + "/" + LOOP_TIMES);
            kSession.fireAllRules();
        });

        kSession.dispose();
    }

    private static void stateless(KieContainer kContainer) {
        var kSession = kContainer.newStatelessKieSession("ksession-stateless-rules");

        var person1 = Person.builder().name("Alice").age(18).build();
        var person2 = Person.builder().name("Bob").age(17).build();
        var person3 = Person.builder().name("Charlie").age(26).build();

        IntStream.range(0, LOOP_TIMES).forEach( i -> {
            System.out.println("\n\nRound " + (i+1) + "/" + LOOP_TIMES);
            kSession.execute(List.of(person1, person2, person3));
        });
    }
}
