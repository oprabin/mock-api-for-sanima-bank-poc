package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.ClientConfig;
import com.digiconnect.mockapiforpoc.client.entity.ResponseKeys;
import com.digiconnect.mockapiforpoc.client.entity.dto.ClientAndResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.repository.ClientConfigRepository;
import com.digiconnect.mockapiforpoc.client.repository.ResponseKeysRepository;
import com.digiconnect.mockapiforpoc.exeption.EntityAlreadyExistsException;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Service
public class ClientManagementService {


    private final ClientConfigRepository clientConfigRepository;
    private final ResponseKeysRepository responseKeysRepository;

    public ClientManagementService(ClientConfigRepository clientConfigRepository, ResponseKeysRepository responseKeysRepository) {
        this.clientConfigRepository = clientConfigRepository;
        this.responseKeysRepository = responseKeysRepository;
    }


    public ResponseEntity addClientWithResponseKey(ClientAndResponseKeysDto clientAndResponseKeysDto) throws EntityAlreadyExistsException, EntityDoesNotExistsException {

        String clientId = clientAndResponseKeysDto.getClientId();
        List<ResponseKeys> responseKeys = clientAndResponseKeysDto.getResponseKeys();

        if (clientConfigRepository.existsClientConfigByClientId(clientId))
            throw new EntityAlreadyExistsException("ClientId: " + clientId);


        for (ResponseKeys responseHeader : responseKeys) {
            ResponseKeys byResponseKeyExists = responseKeysRepository.findByResponseKey(responseHeader.getResponseKey());
            if (byResponseKeyExists == null)
                throw new EntityDoesNotExistsException("responseHeader: " + responseHeader);
        }

        String clientName = clientAndResponseKeysDto.getClientName();

        ClientConfig clientConfig = ClientConfig.builder()
                .uuid(UUID.randomUUID().toString())
                .clientId(clientId)
                .clientName(clientName)
                .responseKeys(responseKeys)
                .build();

        ClientConfig savedClientConfig = clientConfigRepository.save(clientConfig);

        return new ResponseEntity(savedClientConfig, HttpStatus.OK);


    }


    public ResponseEntity addNewResponseKeys(List<String> responseKeys) {

        List<String> addedKeys = new ArrayList<>();


        for (String responseKey : responseKeys) {

            if (!responseKeysRepository.findResponseKeysByResponseKey(responseKey)) {
                addedKeys.add(responseKey);
                ResponseKeys responseKeysEntity = ResponseKeys.builder()
                        .id(UUID.randomUUID().toString())
                        .responseKey(responseKey)
                        .build();

                responseKeysRepository.save(responseKeysEntity);
            }


        }

        return new ResponseEntity(addedKeys, HttpStatus.OK);

    }
}
