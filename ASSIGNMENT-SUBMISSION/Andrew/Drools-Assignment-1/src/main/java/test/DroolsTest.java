package test;

import model.Order;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");

            // Create some orders
            Order order1 = new Order("VIP", 600, "Electronics");
            Order order2 = new Order("Regular", 250, "Clothing");
            Order order3 = new Order("New", 100, "Books");

            // Insert orders into the session
            kSession.insert(order1);
            kSession.insert(order2);
            kSession.insert(order3);

            // Fire all rules
            kSession.fireAllRules();

            // Print the final state of the orders
            System.out.println(order1);
            System.out.println(order2);
            System.out.println(order3);

            kSession.dispose();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
