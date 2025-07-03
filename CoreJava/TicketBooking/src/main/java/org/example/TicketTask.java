package org.example;

public class TicketTask implements  Runnable{
    private int ticketId;

    public TicketTask (int ticketIdInput) {
        ticketId = ticketIdInput;
    }

    public void run() {
        System.out.println("Ticket booked for request : " + ticketId);
    }
}