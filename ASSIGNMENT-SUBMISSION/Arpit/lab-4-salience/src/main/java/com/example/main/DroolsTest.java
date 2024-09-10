package com.example.main;

import com.example.model.Order;
import org.kie.api.KieServices;

import java.util.List;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var orders = List.of(
                Order.builder().name("Order 1").customerType("VIP").orderAmount(600).productCategory("Electronics").build(),
                Order.builder().name("Order 2").customerType("Regular").orderAmount(300).productCategory("Electronics").build(),

                Order.builder().name("Order 3").customerType("VIP").orderAmount(300).productCategory("Electronics").build(),
                Order.builder().name("Order 4").customerType("Regular").orderAmount(100).productCategory("Electronics").build(),

                Order.builder().name("Order 5").customerType("Regular").orderAmount(1200).productCategory("Electronics").build(),
                Order.builder().name("Order 6").customerType("VIP").orderAmount(200).productCategory("Clothing").build(),
                Order.builder().name("Order 7").customerType("Regular").orderAmount(100).productCategory("Clothing").build());

        orders.forEach(kSession::insert);

        kSession.fireAllRules();

        kSession.dispose();
    }
}
