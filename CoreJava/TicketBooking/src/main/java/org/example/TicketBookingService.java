package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class TicketBookingService {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new BookingReceiveTask(18));
        pool.execute(new PaymentTask(19));
        pool.execute(new TicketTask(20));


        pool.execute(new BookingReceiveTask(28));
        pool.execute(new PaymentTask(29));
        pool.execute(new TicketTask(30));


        pool.execute(new BookingReceiveTask(38));
        pool.execute(new PaymentTask(39));
        pool.execute(new TicketTask(40));

        pool.execute(new BookingReceiveTask(48));
        pool.execute(new PaymentTask(49));
        pool.execute(new TicketTask(50));

        pool.execute(new BookingReceiveTask(58));
        pool.execute(new PaymentTask(59));
        pool.execute(new TicketTask(60));

        pool.shutdown();
    }
}