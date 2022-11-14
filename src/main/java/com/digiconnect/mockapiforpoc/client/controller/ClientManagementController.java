package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.ClientConfigDto;
import com.digiconnect.mockapiforpoc.client.entity.dto.ResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.service.ClientManagementService;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

import java.util.List;

import static com.digiconnect.mockapiforpoc.base.BaseInterface.CLIENT_MANAGEMENT_BASE_CONTEXT;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@RestController
@RequestMapping(CLIENT_MANAGEMENT_BASE_CONTEXT)
public class ClientManagementController {

    private ClientManagementService clientManagementService;

    public ClientManagementController(ClientManagementService clientManagementService) {
        this.clientManagementService = clientManagementService;
    }

    @GetMapping("/all")
    public ResponseEntity getAllClientConfig() {
        return null;
    }



    @PostMapping("/addNewClient/")
    public ResponseEntity addNewClient(@NotNull @RequestBody ClientConfigDto clientConfigDto){
        return clientManagementService.addNewClient(clientConfigDto);
    }



    @PostMapping("/addResponseKeysToClient/{clientId}")
    public ResponseEntity addResponseKeysToClient(
            @NotNull @PathVariable("clientId") String clientId,
            @NotNull @RequestBody List<ResponseKeysDto> responseKeysDtos) throws EntityDoesNotExistsException {

        return clientManagementService.addResponseKeysToClient(clientId, responseKeysDtos);


    }




}
