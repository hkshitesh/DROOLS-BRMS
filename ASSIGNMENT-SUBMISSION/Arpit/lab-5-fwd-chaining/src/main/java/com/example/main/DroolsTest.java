package com.example.main;

import com.example.model.Order;
import com.example.model.Product;
import org.kie.api.KieServices;

import java.util.List;

public class DroolsTest {
    public static void main(String[] args) {
        var ks = KieServices.Factory.get();
        var kContainer = ks.getKieClasspathContainer();
        var kSession = kContainer.newKieSession("ksession-rules");

        var product1 = Product.builder().name("Product 1").category("Clothing").price(100).build();
        var product2 = Product.builder().name("Product 2").category("Electronics").price(200).build();
        var product3 = Product.builder().name("Product 3").category("Electronics").price(300).build();


        var orders = List.of(
                Order.builder().name("Order 1").product(product1).quantity(6).build(),
                Order.builder().name("Order 2").product(product2).quantity(3).build(),

                Order.builder().name("Order 3").product(product1).quantity(3).build(),
                Order.builder().name("Order 4").product(product3).quantity(1).build(),

                Order.builder().name("Order 5").product(product1).quantity(12).build(),
                Order.builder().name("Order 6").product(product2).quantity(2).build(),
                Order.builder().name("Order 7").product(product3).quantity(1).build());

        kSession.insert(product1);
        kSession.insert(product2);
        kSession.insert(product3);

        orders.forEach(kSession::insert);


        kSession.fireAllRules();

        kSession.dispose();
    }
}
