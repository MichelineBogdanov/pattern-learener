package org.pattern_learener.behavioral.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
