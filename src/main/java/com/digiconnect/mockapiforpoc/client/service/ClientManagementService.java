package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.ClientConfig;
import com.digiconnect.mockapiforpoc.client.entity.ResponseKeys;
import com.digiconnect.mockapiforpoc.client.entity.dto.ClientConfigDto;
import com.digiconnect.mockapiforpoc.client.entity.dto.ResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.repository.ClientConfigRepository;
import com.digiconnect.mockapiforpoc.client.repository.ResponseKeysRepository;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    private final ResponseKeysService responseKeysService;


    public ClientManagementService(ClientConfigRepository clientConfigRepository, ResponseKeysRepository responseKeysRepository, ResponseKeysService responseKeysService) {
        this.clientConfigRepository = clientConfigRepository;
        this.responseKeysRepository = responseKeysRepository;
        this.responseKeysService = responseKeysService;
    }


/*
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
*/

    public ResponseEntity addResponseKeysToClient(@NotNull String clientId, @NotNull List<ResponseKeysDto> responseKeysDtos) throws EntityDoesNotExistsException {
        Optional<ClientConfig> clientConfigById = clientConfigRepository.findClientConfigByClientId(clientId);
        if (clientConfigById.isEmpty()) {
            throw new EntityDoesNotExistsException("clientId: " + clientId);
        }

        List<ResponseKeys> responseKeys = new ArrayList<>();
        for (ResponseKeysDto responseKeysDto : responseKeysDtos) {
            String responseKey = responseKeysDto.getResponseKey();
            Long fileInformationId = responseKeysDto.getFileInformationId();

            Optional<ResponseKeys> responseKeysByResponseKeyAndFileInformationId = responseKeysRepository.findResponseKeysByResponseKeyAndFileInformationId(responseKey, fileInformationId);
            if (responseKeysByResponseKeyAndFileInformationId.isEmpty()){
                throw new EntityDoesNotExistsException("responseKey: " + responseKey + " && fileInformationId: " + fileInformationId);
            }

            responseKeys.add(responseKeysByResponseKeyAndFileInformationId.get());
        }

        ClientConfig clientConfig = ClientConfig.builder()
                .uuid(UUID.randomUUID().toString())
                .clientId(clientId)
                .clientName(clientConfigById.get().getClientName())
                .responseKeys(responseKeys)
                .build();

        ClientConfig save = clientConfigRepository.save(clientConfig);

        return new ResponseEntity(save, HttpStatus.OK);
    }



    public boolean clientExists(String clientId){
        Optional<ClientConfig> clientConfigRepositoryById = clientConfigRepository.findClientConfigByClientId(clientId);
        return clientConfigRepositoryById.isPresent();
    }


    public ResponseEntity addNewClient(ClientConfigDto clientConfigDto) {
        String clientId = clientConfigDto.getClientId();
        String clientName = clientConfigDto.getClientName();
        List<String> responseKeys = clientConfigDto.getResponseKeys();



        ClientConfig clientConfig = ClientConfig.builder()
                .uuid(UUID.randomUUID().toString())
                .clientId(clientId)
                .clientName(clientName)
                .build();

        ClientConfig save = clientConfigRepository.save(clientConfig);
        return new ResponseEntity(save, HttpStatus.OK);


    }
}
