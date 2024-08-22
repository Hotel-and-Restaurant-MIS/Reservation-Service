package com.luxury.reservation_service.service;

import com.luxury.reservation_service.model.ReservedRooms;
import com.luxury.reservation_service.repository.ReservedRoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservedRoomsService {

    private final ReservedRoomsRepository reservedRoomsRepository;

    @Autowired
    public ReservedRoomsService(ReservedRoomsRepository reservedRoomsRepository) {
        this.reservedRoomsRepository = reservedRoomsRepository;
    }

    public List<ReservedRooms> getAllReservedRooms() {
        return reservedRoomsRepository.findAll();
    }

    public ReservedRooms addReservedRooms(ReservedRooms reservedRooms) {
        return reservedRoomsRepository.save(reservedRooms);
    }
}
