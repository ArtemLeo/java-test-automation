package com.artemdev;

public class FlightBookingService implements BookingService {
    private int bookingsCount;

    public void book(int id, Customer customer) {
        System.out.println("Бронируем авиабилеты. Бронь № " + id + ": " + customer.getFullName());
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

    public void getBookingsCount() {
        System.out.println("Количество броней = " + bookingsCount);
    }
}
