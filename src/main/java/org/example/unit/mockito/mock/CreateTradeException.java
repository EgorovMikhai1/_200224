package org.example.unit.mockito.mock;

public class CreateTradeException extends RuntimeException {
    public CreateTradeException() {
        super("Cannot create such trade!");
    }
}