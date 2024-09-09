package com.example.main;

import com.example.model.Product;
import org.kie.api.KieServices;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var product1 = Product.builder().type("Electronics").price(550).available(true).build();
        var product2 = Product.builder().type("Electronics").price(1200).available(false).build();
        var product3 = Product.builder().type("Electronics").price(400).available(true).build();
        var product4 = Product.builder().type("Books").price(550).available(true).build();

        kSession.insert(product1);
        kSession.insert(product2);
        kSession.insert(product3);
        kSession.insert(product4);

        kSession.fireAllRules();

        kSession.dispose();
    }
}
