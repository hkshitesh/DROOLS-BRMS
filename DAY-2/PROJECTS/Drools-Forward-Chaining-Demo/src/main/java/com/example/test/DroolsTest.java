package com.example.test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.example.model.*;

public class DroolsTest {

	public static void main(String[] args) {

		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Product product1= new Product("Laptop", 1500, "Electronics");
		Product product2= new Product("Pen", 15, "Stationary");
		
		Order order1 = new Order(product1, 1);
		Order order2 = new Order(product2, 10);
		
		kSession.insert(product1);
		kSession.insert(product2);
		kSession.insert(order1);
		kSession.insert(order2);
		kSession.fireAllRules();
		kSession.dispose();

	}

}
