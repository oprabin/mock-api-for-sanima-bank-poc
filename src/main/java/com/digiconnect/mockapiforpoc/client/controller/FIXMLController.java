package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXML;
import com.digiconnect.mockapiforpoc.client.service.FIXMLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

import static com.digiconnect.mockapiforpoc.base.BaseInterface.CLIENT_MANAGEMENT_BASE_CONTEXT;

@RestController
@RequestMapping(path = "/xml",
        produces = "application/xml")
public class FIXMLController {

    @Autowired
    private FIXMLService fixmlService;


    public FIXMLController(FIXMLService fixmlService) {
        this.fixmlService = fixmlService;
    }

    @GetMapping("/BI")
    public FIXML getFIXML(@RequestBody String requestString){
        return (fixmlService.getAllFIXML(requestString));
    }





}
