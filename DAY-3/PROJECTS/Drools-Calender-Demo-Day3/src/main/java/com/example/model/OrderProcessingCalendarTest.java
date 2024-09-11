package com.example.model;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.time.Calendar;

public class OrderProcessingCalendarTest {
    public static void main(String[] args) throws InterruptedException {
        // Load KieServices and KieContainer
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        // Create a stateful Kie session
        KieSession kSession = kContainer.newKieSession("orderKSession");

        // Define the business hours (Monday to Friday, 9 AM to 5 PM)
        Calendar businessHours = (timestamp) -> {
            java.util.Calendar cal = java.util.Calendar.getInstance();
            cal.setTimeInMillis(timestamp);
            int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
            int hourOfDay = cal.get(java.util.Calendar.HOUR_OF_DAY);

            // Allow execution Monday to Friday, 9 AM to 5 PM
            boolean isWeekday = dayOfWeek >= java.util.Calendar.MONDAY && dayOfWeek <= java.util.Calendar.FRIDAY;
            boolean isBusinessHours = hourOfDay >= 9 && hourOfDay <= 17;

            return isWeekday && isBusinessHours;
        };

        Calendar nonBusinessHours = (timestamp) -> !businessHours.isTimeIncluded(timestamp);

        // Register the calendar with the KieSession
        kSession.getCalendars().set("businessHours", businessHours);
        kSession.getCalendars().set("nonBusinessHours", nonBusinessHours);


        // Create an order and insert it into the session
        Order order = new Order("Order-001");
        kSession.insert(order);

        // Fire all rules
        kSession.fireAllRules();

        // Dispose of the session
        kSession.dispose();
    }
}
