package com.artemdev;

public class HotelBookingService extends AbstractBookingService  {

    public void book(int id, Customer customer) {
        System.out.println("Бронируем отель. Бронь № " + id + ": " + customer.getFullName());
        bookingsCount++;
    }

    public void cancel(int id) {
        if (bookingsCount == 0) {
            System.out.println("Нет броней в отеле.");
        } else {
            System.out.println("Отель. Отменяем бронь № " + id);
            bookingsCount--;
        }
    }

    public int getBookingsCount() {
        System.out.println("Количество броней = " + bookingsCount);
        return 0;
    }
}
