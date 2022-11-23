package com.Bus.Ticket.controller;

import com.Bus.Ticket.model.Booking;
import com.Bus.Ticket.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController()
@CrossOrigin(value = "*")
@RequestMapping("/api/booking")
public class BookingController {

    @Autowired
    private final BookingRepo bookingRepo;

    public BookingController(BookingRepo bookingRepo) {
        this.bookingRepo = bookingRepo;
    }


    @GetMapping("/allbookingsofuser/{userId}")
    public List<Booking> getAllBookingOfUser(@PathVariable("userId") Integer userId){
        return  bookingRepo.findByUserId(userId);
    }
    @GetMapping("/allbookingsofbus/{busId}")
    public List<Booking> getAllBookingOfBus(@PathVariable("busId") Integer busId){
        return  bookingRepo.findByBusId(busId);
    }
    @PostMapping("/bookabus")
    Booking newBooking(@RequestBody Booking newBooking){


        return bookingRepo.save(newBooking);
    }


    @DeleteMapping("/deletebooking/{bookingid}")
    public void deletebooking(@PathVariable("bookingid") Integer bookingid){
        bookingRepo.deleteById(bookingid);
    }

@GetMapping("/allbookings")
    public List<Booking> getAllBookings(){
        return bookingRepo.findAll();
}

}


