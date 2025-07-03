package org.example;

public class BookingReceiveTask implements  Runnable{
    private int bookingId;

    public BookingReceiveTask (int bookingIdInput) {
        bookingId = bookingIdInput;
    }

    public void run() {
        System.out.println("Booking received for request : " + bookingId);
    }
}
