package com.luxury.reservation_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private String roomTypeName;
    private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private Integer roomQuantity;

    @OneToOne
    @JoinColumn(name= "customer_id", nullable = false)
    private Customer customer;

}
