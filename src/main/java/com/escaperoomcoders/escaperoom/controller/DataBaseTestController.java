package com.escaperoomcoders.escaperoom.controller;

import com.escaperoomcoders.escaperoom.repository.service.EscapeRoomMailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;


public class DataBaseTestController {


    private final EscapeRoomMailService escapeRoomMailService;

    public DataBaseTestController(EscapeRoomMailService escapeRoomMailService) {
        this.escapeRoomMailService = escapeRoomMailService;
    }


    public void testDatabaseConnection(){
        //implementar lógica
        escapeRoomMailService.sendMailForChallenge("reto2");
    }
}
