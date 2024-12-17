package com.escaperoomcoders.escaperoom.repository.service;

import com.escaperoomcoders.escaperoom.model.SecretMessage;
import com.escaperoomcoders.escaperoom.repository.SecretMessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretMessageService {

    //Implementar el resto de la lógica

    private final EscapeRoomMailService escapeRoomMailService;

    public SecretMessageService(EscapeRoomMailService escapeRoomMailService) {

        this.escapeRoomMailService = escapeRoomMailService;
    }



    public void deleteMessage(Long id){
        escapeRoomMailService.sendMailForChallenge("reto3");
    }

}
