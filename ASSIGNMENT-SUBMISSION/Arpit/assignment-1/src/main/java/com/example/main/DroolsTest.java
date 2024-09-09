package com.example.main;

import com.example.model.Order;
import org.kie.api.KieServices;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var order1 = Order.builder().customerType("VIP").orderAmount(600).productCategory("Electronics").build();
        var order2 = Order.builder().customerType("Regular").orderAmount(300).productCategory("Electronics").build();

        var order3 = Order.builder().customerType("VIP").orderAmount(300).productCategory("Electronics").build();
        var order4 = Order.builder().customerType("Regular").orderAmount(100).productCategory("Electronics").build();

        var order5 = Order.builder().customerType("Regular").orderAmount(1200).productCategory("Electronics").build();
        var order6 = Order.builder().customerType("VIP").orderAmount(200).productCategory("Clothing").build();
        var order7 = Order.builder().customerType("Regular").orderAmount(100).productCategory("Clothing").build();

        kSession.insert(order1);
        kSession.insert(order2);
        kSession.insert(order3);
        kSession.insert(order4);
        kSession.insert(order5);
        kSession.insert(order6);
        kSession.insert(order7);

        kSession.fireAllRules();

        kSession.dispose();
    }
}
