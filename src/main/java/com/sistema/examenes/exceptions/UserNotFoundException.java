package com.sistema.examenes.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("EL usuario no existe en la base de datos");
    }

    public UserNotFoundException(String message){
        super(message);
    }
}
