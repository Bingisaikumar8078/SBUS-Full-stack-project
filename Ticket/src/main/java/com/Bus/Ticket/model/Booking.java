package com.Bus.Ticket.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
//@Getter
//@Setter
public class Booking {
//    arrivalTime
//
//    busId
//    busName
//
//    busNumber
//
//    departureTime
//
//    journeyDate
//
//    selectedSeats
//
//    totalfair
//    userId

@Id
@GeneratedValue
    private  Integer Bookingid;
private  String arrivalTime;
    private Integer busId;
    private  String busName;
    private  String busNumber;
    private  String departureTime;
    private  String journeyDate;
    private String selectedSeats;
    private String totalfair;
    private Integer userId;

}
