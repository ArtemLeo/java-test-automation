package com.artemdev.assertions;

public class Main {

    // 1. Создать сервис бронирования авиабилетов
    // 1.1 Сервис позволяет бронировать
    // 1.2 Сервис позволяет отменять бронь
    // 1.3 Сервис позволяет получить текущее количество броней

    // 2 Создать сервис бронирования отелей
    // 2.1 Сервис позволяет бронировать
    // 2.2 Сервис позволяет отменять бронь
    // 2.3 Сервис позволяет получить текущее количество броней

    // 3 Программа должна поддерживать оба сервиса


    public static void main(String[] args) {
        Customer specialAgent = new Customer("James", "Bond");

        BookingService bookingService = new HotelBookingService();
        bookingService.book(1, specialAgent);
        bookingService.cancel(1);
        bookingService.getBookingsCount();
    }
}