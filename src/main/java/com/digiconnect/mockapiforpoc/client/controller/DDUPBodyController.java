package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.DDUPBody;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXML;
import com.digiconnect.mockapiforpoc.client.service.DDUPBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/xml",
        produces = "application/xml")
public class DDUPBodyController {
    @Autowired
    private DDUPBodyService ddupBodyService;
    @GetMapping("/DDUP")
    public ResponseEntity<DDUPBody> getDDUP(@RequestBody String requestString){
        return ResponseEntity.ok(ddupBodyService.getDDUPXML(requestString));
    }
}
