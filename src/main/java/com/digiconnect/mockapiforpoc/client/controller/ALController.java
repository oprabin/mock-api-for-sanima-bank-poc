package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.AddLien.FIXML;
import com.digiconnect.mockapiforpoc.client.service.ALService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test", produces = MediaType.APPLICATION_XML_VALUE)
public class ALController {
    
    private final ALService alService;

    public ALController(ALService alService) {
        this.alService = alService;
    }

    @GetMapping("/addlien")
    public ResponseEntity<FIXML> returnResponse(@RequestBody final String requestString){
        return ResponseEntity.ok(alService.returnResponse(requestString));
    }
}
