package com.example.main;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.example.model.*;

public class DroolsTest {

	public static void main(String[] args) {
		
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("ksession-rules");
		
		Customer customer = new Customer("Tom Smith", "Premium");
		kSession.insert(customer);
		kSession.fireAllRules();
		System.out.println(customer);	
		kSession.dispose();
	}

}
