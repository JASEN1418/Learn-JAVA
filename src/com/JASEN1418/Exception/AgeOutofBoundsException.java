package com.JASEN1418.Exception;

public class AgeOutofBoundsException extends RuntimeException{
    public AgeOutofBoundsException(String message) {
        super(message);
    }

    public AgeOutofBoundsException() {
        super();
    }
}
