package com.escaperoomcoders.escaperoom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        // Configuración de un JavaMailSender vacío o mock
        return new JavaMailSenderImpl();
    }
}
