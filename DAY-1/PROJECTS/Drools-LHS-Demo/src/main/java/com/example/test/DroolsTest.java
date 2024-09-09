package com.example.test;
import com.example.model.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;


public class DroolsTest {

	public static void main(String[] args) {
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Product product1 = new Product("Electronics", 1200, true);
		Product product2 = new Product("Clothing", 800, false);
		Product product3 = new Product("Books", 900, true);
		Product product4 = new Product("Grocery", 300, true);
		
		kSession.insert(product1);
		kSession.insert(product2);
		kSession.insert(product3);
		kSession.insert(product4);
		kSession.fireAllRules();
		kSession.dispose();
	}
}
