package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXML;
import com.digiconnect.mockapiforpoc.client.service.BIService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test", produces = MediaType.APPLICATION_XML_VALUE)
public class BIController {

    private final BIService biService;


    public BIController(BIService biService) {
        this.biService = biService;
    }

    @GetMapping("/business")
    public ResponseEntity<FIXML> returnResponse(@RequestBody final String requestString){
        return ResponseEntity.ok(biService.returnResponse(requestString));
    }
}
