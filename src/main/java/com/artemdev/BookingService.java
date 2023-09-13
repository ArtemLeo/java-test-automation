package com.artemdev;

public interface BookingService {
    void book(int bookingId, Customer customer);

    void cancel(int bookingId);

    void getBookingsCount();
}
