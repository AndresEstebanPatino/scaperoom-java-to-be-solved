package com.escaperoomcoders.escaperoom.controller;

import com.escaperoomcoders.escaperoom.repository.service.EscapeRoomMailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class MailTestController {

    private final EscapeRoomMailService escapeRoomMailService;

    public MailTestController(EscapeRoomMailService escapeRoomMailService) {
        this.escapeRoomMailService = escapeRoomMailService;
    }

    public void sendTestMail(){
        //Implementar lógica
        escapeRoomMailService.sendMailForChallenge("reto1");
    }
}
