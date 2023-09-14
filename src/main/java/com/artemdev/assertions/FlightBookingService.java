package com.artemdev.assertions;

public class FlightBookingService extends AbstractBookingService {


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

    public int getBookingsCount() {
        System.out.println("Количество броней = " + bookingsCount);
        return bookingsCount;
    }
}
