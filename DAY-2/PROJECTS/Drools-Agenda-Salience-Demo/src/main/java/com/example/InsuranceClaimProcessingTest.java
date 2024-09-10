package com.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class InsuranceClaimProcessingTest {
	
    public static void main(String[] args)
    {
    	KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        // Create sample claim, customer, and assessment
        Claim claim = new Claim("Claim-001", 1200.0);
        Customer customer = new Customer("Jane Doe", 6); // 6 years of loyalty
        Assessment assessment = new Assessment(claim.getId(), 1200.0);

        // Insert facts into the session
        kSession.insert(claim);
        kSession.insert(customer);
        kSession.insert(assessment);

        // Set focus on the "validation" agenda group and fire rules
        kSession.getAgenda().getAgendaGroup("validation").setFocus();
        kSession.fireAllRules();

        // Set focus on the "assessment" agenda group and fire rules
        kSession.getAgenda().getAgendaGroup("assessment").setFocus();
        kSession.fireAllRules();

        // Set focus on the "approval" agenda group and fire rules
        kSession.getAgenda().getAgendaGroup("approval").setFocus();
        kSession.fireAllRules();

        // Dispose of the session
        kSession.dispose();

    }

}
