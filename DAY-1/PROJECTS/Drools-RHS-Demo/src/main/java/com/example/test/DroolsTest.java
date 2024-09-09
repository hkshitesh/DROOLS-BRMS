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
		
		Customer customer1 = new Customer("Alice", 1200, "Silver");
		Customer customer2 = new Customer("Bon", 800, "Gold");
		Customer customer3 = new Customer("Charlie", 300, "Bronze");
		
		kSession.insert(customer1);
		kSession.insert(customer2);
		kSession.insert(customer3);
		
		kSession.fireAllRules();
		
		kSession.dispose();
		

	}

}
