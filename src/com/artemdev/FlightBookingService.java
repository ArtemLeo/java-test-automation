package com.artemdev;

public class FlightBookingService {
    private int bookingsCount;

    public void bookFlight(int id, Customer customer) {
        System.out.println("Бронь № " + id + ": " + customer.getFullName());
        bookingsCount++;
    }

    public void cancel(int id) {
        if (bookingsCount == 0) {
            System.out.println("Нет броней. Делать нечего");
        } else {
            System.out.println("Отменяем бронь № " + id);
            bookingsCount--;
        }
    }

    public void getCurrentBookingsCount() {
        System.out.println("Количество броней = " + bookingsCount);
    }
}
