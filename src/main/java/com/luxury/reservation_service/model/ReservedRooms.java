package com.luxury.reservation_service.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservedRooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="room_id", nullable=false)
    private Rooms rooms;

    @ManyToOne
    @JoinColumn(name="booking_id")
    private Booking booking;


}
