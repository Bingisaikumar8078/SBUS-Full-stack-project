package com.Bus.Ticket.exception;

public class BusNotFoundException extends RuntimeException {
    public BusNotFoundException(Integer id) {
        super("Could not findd");
    }
}
