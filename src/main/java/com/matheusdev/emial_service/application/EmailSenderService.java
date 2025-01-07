package com.matheusdev.emial_service.application;

import com.matheusdev.emial_service.adpaters.EmailSenderGateawy;
import com.matheusdev.emial_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateawy emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateawy emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body){
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
}
