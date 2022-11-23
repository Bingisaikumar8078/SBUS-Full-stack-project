package com.Bus.Ticket.repo;

import com.Bus.Ticket.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer> {

    List<Booking> findByUserId(Integer userId);

    List<Booking> findByBusId(Integer busId);
}
