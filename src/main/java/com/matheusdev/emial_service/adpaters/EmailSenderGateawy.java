package com.matheusdev.emial_service.adpaters;

public interface EmailSenderGateawy {

    void sendEmail(String to, String subject, String body);
    //REPRESENTA O CONTRATO COM O PROVEDOR DE EMAIL
}
