package org.example;

public  class PaymentTask implements  Runnable{
    private int paymentId;

    public PaymentTask (int paymentIdInput) {
        paymentId = paymentIdInput;
    }

    public void run() {
        System.out.println("Payment received for request : " + paymentId);
    }
}