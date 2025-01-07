package com.matheusdev.emial_service.infra.ses;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.matheusdev.emial_service.adpaters.EmailSenderGateawy;
import com.matheusdev.emial_service.core.exceptions.EmailServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//COMUNICAÇÃO PARA UM SERVIÇO ESPECIFICO
@Service
public class SesEmailSender implements EmailSenderGateawy {

    private final AmazonSimpleEmailService amazonSimpleEmailService;

    @Autowired
    public SesEmailSender(AmazonSimpleEmailService amazonSimpleEmailService){
        this.amazonSimpleEmailService = amazonSimpleEmailService;
    }

    @Override
    public void sendEmail(String to, String subject, String body){
        SendEmailRequest request =
                new SendEmailRequest().withSource("matheusfesantos.dev@gmail.com")//QUEM EVIA O EMAIL
                        .withDestination(new Destination().withToAddresses()) // QUEM RECEBE
                        .withMessage(new Message()
                                .withSubject(new Content(subject))
                                .withBody(new Body().withText(new Content(body)))
                        );
        try{
            this.amazonSimpleEmailService.sendEmail(request);
        }catch (AmazonServiceException exception){
            throw new EmailServiceException("Falha ao enviar seu email", exception);
        }
    }
}
