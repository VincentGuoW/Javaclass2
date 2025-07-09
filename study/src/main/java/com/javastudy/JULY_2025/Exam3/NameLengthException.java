package com.javastudy.JULY_2025.Exam3;

/*
 * NameLenght --> make own exception with name easy to understand
 * Exception  --> This is an exception class
 * 
 * RuntimeException  --> Exception cause by the input
 * Exception         --> Exception cause by local info
 */

public class NameLengthException extends RuntimeException {

    public NameLengthException() {
        super();
    }
    
    public NameLengthException(String name){
        super(name);
    }
    
}
