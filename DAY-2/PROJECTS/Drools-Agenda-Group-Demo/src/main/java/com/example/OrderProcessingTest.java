package com.example;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class OrderProcessingTest {

	public static void main(String[] args) {

		  KieServices ks = KieServices.Factory.get();
          KieContainer kContainer = ks.getKieClasspathContainer();
          KieSession kSession = kContainer.newKieSession("ksession-rules");
          
          Order order = new Order("Order-123", 120.0);
          Payment payment = new Payment(order.getId());
          Customer customer = new Customer("John Doe");
          Inventory inventory = new Inventory("product-123", 10);

          // Insert facts into the session
          kSession.insert(order);
          kSession.insert(payment);
          kSession.insert(customer);
          kSession.insert(inventory);

          // Set focus on the "validation" agenda group and fire rules
          kSession.getAgenda().getAgendaGroup("notification").setFocus();
          kSession.fireAllRules();

          // Set focus on the "processing" agenda group and fire rules
          kSession.getAgenda().getAgendaGroup("processing").setFocus();
          kSession.fireAllRules();

          // Set focus on the "notification" agenda group and fire rules
          kSession.getAgenda().getAgendaGroup("validation").setFocus();
          kSession.fireAllRules();

          // Dispose of the session
          kSession.dispose();


	}

}
