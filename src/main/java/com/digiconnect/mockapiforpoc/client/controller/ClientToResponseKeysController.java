package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.ClientToResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.service.ClientToResponseKeysService;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

import static com.digiconnect.mockapiforpoc.base.BaseInterface.CLIENT_TO_RESPONSE_KEYS;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@RestController
@RequestMapping(CLIENT_TO_RESPONSE_KEYS)
public class ClientToResponseKeysController {

    private final ClientToResponseKeysService clientToResponseKeysService;

    public ClientToResponseKeysController(ClientToResponseKeysService clientToResponseKeysService) {
        this.clientToResponseKeysService = clientToResponseKeysService;
    }


    @PostMapping("/clientToResponseKeys")
    public ResponseEntity addClientToResponseKeys(@NotNull @RequestBody ClientToResponseKeysDto clientToResponseKeysDto) throws EntityDoesNotExistsException {
        return clientToResponseKeysService.addClientToResponseKeys(clientToResponseKeysDto);


    }


}
