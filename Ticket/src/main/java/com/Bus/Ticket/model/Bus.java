package com.Bus.Ticket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private  String name;

    @Column(name = "number")
    private  String number;

    @Column(name = "capacity")
    private  Integer capacity;
    @Column(name = "fromplace")
    private  String fromplace;
    @Column(name = "toplace")
    private  String toplace;
    @Column(name = "date")
    private  String date;
    @Column(name = "departure")
    private  String departure;
    @Column(name = "arrival")
    private  String arrival;
    @Column(name = "type")
    private  String type;
    @Column(name = "fare")
    private Integer fare;
    @Column(name = "status")
    private  String status;
//    @OneToMany(targetEntity = Booking.class, cascade = CascadeType.ALL)
//    @JoinColumn(name = "cp_fk", referencedColumnName = "number")
//    private List<Booking> booking;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getFromplace() {
        return fromplace;
    }

    public void setFromplace(String fromplace) {
        this.fromplace = fromplace;
    }

    public String getToplace() {
        return toplace;
    }

    public void setToplace(String toplace) {
        this.toplace = toplace;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getFare() {
        return fare;
    }

    public void setFare(Integer fare) {
        this.fare = fare;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public Bus() {
//    }
//
//    public Bus(Integer id, String name, String number, String capacity, String fromplace, String toplace, String date, String departure, String arrival, String type, Integer fare, String status) {
//        this.id = id;
//        this.name = name;
//        this.number = number;
//        this.capacity = capacity;
//        this.fromplace = fromplace;
//        this.toplace = toplace;
//        this.date = date;
//        this.departure = departure;
//        this.arrival = arrival;
//        this.type = type;
//        this.fare = fare;
//        this.status = status;
//    }

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", capacity='" + capacity + '\'' +
                ", fromplace='" + fromplace + '\'' +
                ", toplace='" + toplace + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", type='" + type + '\'' +
                ", fare=" + fare +
                ", status='" + status + '\'' +
                '}';
    }
}
