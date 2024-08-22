package com.luxury.reservation_service.controller;

import com.luxury.reservation_service.model.Rooms;
import com.luxury.reservation_service.service.RoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomsController {

    private final RoomsService roomsService;

    @Autowired
    public RoomsController(RoomsService roomsService) {
        this.roomsService = roomsService;
    }

    @GetMapping("/all")
    public List<Rooms> getAllRooms() {
        return roomsService.getAllRooms();
    }
}
