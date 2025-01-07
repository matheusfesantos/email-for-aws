package com.matheusdev.emial_service.core;

public record EmailRequest(String to, String subject, String body){
}
