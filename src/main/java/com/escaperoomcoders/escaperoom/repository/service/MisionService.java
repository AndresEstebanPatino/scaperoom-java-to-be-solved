package com.escaperoomcoders.escaperoom.repository.service;

import com.escaperoomcoders.escaperoom.model.Agent;
import com.escaperoomcoders.escaperoom.model.Mision;
import com.escaperoomcoders.escaperoom.repository.AgentRepository;
import com.escaperoomcoders.escaperoom.repository.MisionRespository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MisionService {

    //Implementar el resto de la lógica
    private final EscapeRoomMailService escapeRoomMailService;

    public MisionService(EscapeRoomMailService escapeRoomMailService) {

        this.escapeRoomMailService =  escapeRoomMailService;
    }


    public void deleteMision(Long id) {

        escapeRoomMailService.sendMailForChallenge("reto5");

    }

    public void assignAgentToMission(Long missionId, Long agentId) {


        escapeRoomMailService.sendMailForChallenge("reto6");
    }


}

