package com.luxury.reservation_service.service;

import com.luxury.reservation_service.model.Rooms;
import com.luxury.reservation_service.repository.RoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomsService {

    private final RoomsRepository roomsRepository;

    @Autowired
    public RoomsService(RoomsRepository roomsRepository) {
        this.roomsRepository = roomsRepository;
    }

    public List<Rooms> getAllRooms(){
        return roomsRepository.findAll();
    }
}
