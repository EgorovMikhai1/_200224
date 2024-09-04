package org.example.unit.mockito.stub;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        super("No such customer found!");
    }
}