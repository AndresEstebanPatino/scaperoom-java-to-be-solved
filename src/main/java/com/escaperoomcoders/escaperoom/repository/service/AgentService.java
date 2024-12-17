package com.escaperoomcoders.escaperoom.repository.service;

import com.escaperoomcoders.escaperoom.model.Agent;
import com.escaperoomcoders.escaperoom.repository.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentService {

    //Implementar el resto de la lógica
    private  final EscapeRoomMailService escapeRoomMailService;

    public AgentService(EscapeRoomMailService escapeRoomMailService) {

        this.escapeRoomMailService = escapeRoomMailService;
    }

    public void deleteAgent(Long id){

        escapeRoomMailService.sendMailForChallenge("reto4");


    }
}
