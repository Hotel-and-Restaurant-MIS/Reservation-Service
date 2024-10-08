package com.luxury.reservation_service.controller;

import com.luxury.reservation_service.model.Booking;
import com.luxury.reservation_service.model.Reservation;
import com.luxury.reservation_service.model.RoomCount;
import com.luxury.reservation_service.model.RoomType;
import com.luxury.reservation_service.service.BookingService;
import com.luxury.reservation_service.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService, ReservationService reservationService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Booking>> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/roomType/available")
    public ResponseEntity<List<RoomCount>> getAvailableRoomCount(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from, @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return bookingService.getAvailableRoomCount(from, to);
    }
}
