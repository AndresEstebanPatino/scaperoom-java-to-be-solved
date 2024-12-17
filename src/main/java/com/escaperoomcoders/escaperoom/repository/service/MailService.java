package com.escaperoomcoders.escaperoom.repository.service;

import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private final JavaMailSender mailSender;

    public MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendMail(String to, String subject, String body) {
        try {
            if ("default_user".equals(System.getProperty("spring.mail.username"))) {
                System.out.println("Servicio de correo no configurado. Saltando envío de correo.");
                return; // Simula la omisión del correo
            }

            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(body);
            mailSender.send(message);

        } catch (MailException e) {
            System.out.println("Error al enviar correo: " + e.getMessage());
        }
    }
}