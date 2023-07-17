package com.company.openclosep;

import java.util.List;

public class PhoneSubscriber extends Subscriber {
    // Open for extension
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return (double) (totalDuration * baseRate) /100;
    }




}