package com.luxury.reservation_service.repository;

import com.luxury.reservation_service.model.ReservedRooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservedRoomsRepository extends JpaRepository<ReservedRooms, Integer> {
}
