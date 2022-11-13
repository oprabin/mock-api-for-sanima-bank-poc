package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.dto.ClientAndResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.entity.dto.ResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.service.ClientManagementService;
import com.digiconnect.mockapiforpoc.client.service.ResponseKeysService;
import com.digiconnect.mockapiforpoc.exeption.EntityAlreadyExistsException;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

import static com.digiconnect.mockapiforpoc.base.BaseInterface.RESPONSE_KEYS_BASE_CONTEXT;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@RestController
@RequestMapping(RESPONSE_KEYS_BASE_CONTEXT)
public class ResponseKeysManagementController {

    private final ClientManagementService clientManagementService;
    private final ResponseKeysService responseKeysService;

    public ResponseKeysManagementController(ClientManagementService clientManagementService, ResponseKeysService responseKeysService) {
        this.clientManagementService = clientManagementService;
        this.responseKeysService = responseKeysService;
    }


    @PostMapping(value = "/addClientWithResponseKey")
    public ResponseEntity addClientWithResponseKey(@RequestBody @NotNull ClientAndResponseKeysDto clientAndResponseKeysDto)
            throws EntityDoesNotExistsException, EntityAlreadyExistsException {

        return clientManagementService.addClientWithResponseKey(clientAndResponseKeysDto);


    }


    @PostMapping(value = "/addNewResponseKeys")
    public ResponseEntity addNewResponseKeys(@NotNull @RequestBody List<ResponseKeysDto> responseKeysDtos) throws EntityDoesNotExistsException {
        return responseKeysService.addNewResponseKeys(responseKeysDtos);
    }








}
