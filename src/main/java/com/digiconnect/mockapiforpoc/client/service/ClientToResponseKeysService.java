package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.ClientConfig;
import com.digiconnect.mockapiforpoc.client.entity.ClientToResponseKeys;
import com.digiconnect.mockapiforpoc.client.entity.ResponseKeys;
import com.digiconnect.mockapiforpoc.client.entity.dto.ClientToResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.repository.ClientConfigRepository;
import com.digiconnect.mockapiforpoc.client.repository.ClientToResponseKeysRepository;
import com.digiconnect.mockapiforpoc.client.repository.ResponseKeysRepository;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Service
public class ClientToResponseKeysService {

    private final ClientConfigRepository clientConfigRepository;
    private final ResponseKeysRepository responseKeysRepository;
    private final ClientToResponseKeysRepository clientToResponseKeysRepository;

    public ClientToResponseKeysService(ClientConfigRepository clientConfigRepository, ResponseKeysRepository responseKeysRepository, ClientToResponseKeysRepository clientToResponseKeysRepository) {
        this.clientConfigRepository = clientConfigRepository;
        this.responseKeysRepository = responseKeysRepository;
        this.clientToResponseKeysRepository = clientToResponseKeysRepository;
    }


    public ResponseEntity addClientToResponseKeys(ClientToResponseKeysDto clientToResponseKeysDto) throws EntityDoesNotExistsException {
        String clientId = clientToResponseKeysDto.getClientId();
        List<ResponseKeys> responseKeys = new ArrayList<>();



        Map<String, Long> responseKeyToFileInformationId = clientToResponseKeysDto.getResponseKeyToFileInformationId();

        for (String responseKey : responseKeyToFileInformationId.keySet()) {
            Long fileInformationId = responseKeyToFileInformationId.get(responseKey);
            Optional<ResponseKeys> responseKeyFromDb = responseKeysRepository.findResponseKeysByResponseKeyAndFileInformationId(responseKey, fileInformationId);

            if (responseKeyFromDb.isEmpty()) {
                throw new EntityDoesNotExistsException("responseKey: " + responseKey + " && fileInformationId: " + fileInformationId);
            }

            responseKeys.add(responseKeyFromDb.get());

        }

        Optional<ClientConfig> clientConfigByClientId = clientConfigRepository.findClientConfigByClientId(clientId);
        if (clientConfigByClientId.isEmpty()) {
            throw new EntityDoesNotExistsException("clientId: " + clientId);
        }



        ClientToResponseKeys clientToResponseKeys = ClientToResponseKeys.builder()
                .id(UUID.randomUUID().toString())
                .clientConfig(clientConfigByClientId.get())
                .responseKeys(responseKeys)
                .build();


        ClientToResponseKeys save = clientToResponseKeysRepository.save(clientToResponseKeys);
        return new ResponseEntity(save, HttpStatus.OK);


    }
















}
