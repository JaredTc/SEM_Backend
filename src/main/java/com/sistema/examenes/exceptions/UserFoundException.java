package com.sistema.examenes.exceptions;


public class UserFoundException extends  Exception{

    public UserFoundException(){
        super("EL usuario con ese username ya existe en la base de datos");
    }

    public UserFoundException(String message){
        super(message);
    }

}
