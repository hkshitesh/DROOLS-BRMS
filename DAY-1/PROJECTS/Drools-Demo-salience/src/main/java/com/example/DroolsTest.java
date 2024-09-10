package com.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsTest {
	
	public static void main(String[] args) {
	
	KieServices ks = KieServices.Factory.get();
	KieContainer kContainer = ks.getKieClasspathContainer();
	KieSession kSession = kContainer.newKieSession("ksession-rules");
	
	Orders order1 = new Orders("VIP", 1000);
	Orders order2 = new Orders("Regular", 1000);
	Orders order3 = new Orders("New", 1000);
	
	kSession.insert(order1);
	kSession.insert(order2);
	kSession.insert(order3);
	kSession.fireAllRules();
	
	System.out.println(order1);
	System.out.println(order2);
	System.out.println(order3);
	
	kSession.dispose();
	
	}

}
