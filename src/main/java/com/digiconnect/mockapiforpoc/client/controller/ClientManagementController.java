package com.digiconnect.mockapiforpoc.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.digiconnect.mockapiforpoc.base.BaseInterface.CLIENT_MANAGEMENT_BASE_CONTEXT;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@RestController
@RequestMapping(CLIENT_MANAGEMENT_BASE_CONTEXT)
public class ClientManagementController {

    @GetMapping("/all")
    public ResponseEntity getAllClientConfig() {
        return null;
    }

}
