package com.luxury.reservation_service.controller;

import com.luxury.reservation_service.model.Reservation;
import com.luxury.reservation_service.model.ReservedRooms;
import com.luxury.reservation_service.service.ReservationService;
import com.luxury.reservation_service.service.ReservedRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservedRooms")
public class ReservedRoomsController {

    private final ReservedRoomsService reservedRoomsService;

    @Autowired
    public ReservedRoomsController(ReservedRoomsService reservedRoomsService) {
        this.reservedRoomsService = reservedRoomsService;
    }

    @GetMapping("/all")
    public List<ReservedRooms> getAllReservedRooms() {
        return reservedRoomsService.getAllReservedRooms();
    }

    @PostMapping("/add")
    public ReservedRooms addReservedRoom(@RequestBody ReservedRooms reservedRooms) {
        return  reservedRoomsService.addReservedRooms(reservedRooms);
    }
}
