package com.matheusdev.emial_service.core.exceptions;

public class EmailServiceException extends RuntimeException {

    public EmailServiceException(String message){
        super(message);
    }

    //THROWABLE - MOTIVO DO ERRO
    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
