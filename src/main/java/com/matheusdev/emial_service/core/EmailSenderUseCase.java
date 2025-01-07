package com.matheusdev.emial_service.core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);
    //REPRESENTA CASO DE USO
}
