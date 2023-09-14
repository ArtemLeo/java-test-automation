package com.artemdev.assertions;

import com.artemdev.assertions.BookingService;
import com.artemdev.assertions.Customer;
import com.artemdev.assertions.FlightBookingService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightBookingServiceTest {
    @Test
    public void getBookingsCountIsIncreasedWhen1Booking() {
        BookingService flightBookingService = new FlightBookingService();
        Customer customer = new Customer("James", "Bond");
        flightBookingService.book(1, customer);
        int actualBookingsCount = flightBookingService.getBookingsCount();
        int expectedBookingsCount = 1;

        assertEquals(expectedBookingsCount, actualBookingsCount, "BookingsCount is not done!");
    }
}
