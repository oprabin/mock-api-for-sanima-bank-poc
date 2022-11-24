package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.AccountTransfer.FIXML;
import com.digiconnect.mockapiforpoc.client.service.ATService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping(value="/test"/* , produces = MediaType.APPLICATION_XML_VALUE */)
public class ATController {

    private final ATService atService;


    public ATController(ATService atService) {
        this.atService = atService;
    }

    @GetMapping(value="/transfer", produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<FIXML> returnResponse(@RequestBody final String requestString){
        return ResponseEntity.ok(atService.returnResponse(requestString));
    }

//    @GetMapping("/transferToString")
//    public ResponseEntity<String> returnString(@RequestBody final String requestString) throws JAXBException{
//        return ResponseEntity.ok(atService.returnString(requestString));
//    }
}
