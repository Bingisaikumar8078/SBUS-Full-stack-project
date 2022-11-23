package com.Bus.Ticket.controller;

import com.Bus.Ticket.exception.BusNotFoundException;
import com.Bus.Ticket.model.Bus;
import com.Bus.Ticket.repo.BusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bus")
public class BusController {

    @Autowired
    private  final BusRepo busRepo;


    public BusController(BusRepo busRepo) {
        this.busRepo = busRepo;
    }
    @GetMapping("/allbuses")
    public List<Bus> getAllBuses() {
        return busRepo.findAll();
    }


    @PostMapping("/bus")

    Bus newBus(@RequestBody Bus newBus) {
        return busRepo.save(newBus);
    }


//    @GetMapping("/bus/{id}")
//    Bus getBusById(@PathVariable Long id) {
//        if(busRepo.existsById(id)){
//            System.out.println("bus exists");
//        }
//        else{
//            System.out.println("not found");
//        }
//        return busRepo.findById(id)
//                .orElseThrow(() -> new BusNotFoundException(id));
//    }

    @GetMapping("/bus/{id}")
    Optional<Bus> getBusById(@PathVariable("id") Integer id) {
//        if(busRepo.findBynumber(number)){
//            System.out.println("bus exists");
//        }
//        else{
//            System.out.println("not found");
//        }
        return busRepo.findById(id);
//        return null;
    }



    @PutMapping("/bus/{id}")
    Bus updateBus(@RequestBody Bus newBus, @PathVariable Integer id ){
        return  busRepo.findById(id)
                .map(bus -> {

                    bus.setCapacity(newBus.getCapacity());
                    bus.setFromplace(newBus.getFromplace());
                    bus.setToplace(newBus.getToplace());
                    bus.setDate(newBus.getDate());
                    bus.setArrival(newBus.getArrival());
                    return  busRepo.save(bus);



                }).orElseThrow(()-> new BusNotFoundException(id));
    }

    @DeleteMapping("/bus/{id}")
    String deleteBus(@PathVariable Integer id){
        if(!busRepo.existsById(id)){
            throw new BusNotFoundException(id);
        }
        busRepo.deleteById(id);
        return  "bus with id "+id+" has been deleted success.";
    }

}
