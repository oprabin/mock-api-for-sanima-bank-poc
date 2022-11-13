package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.FileInformation;
import com.digiconnect.mockapiforpoc.client.entity.ResponseKeys;
import com.digiconnect.mockapiforpoc.client.entity.dto.ResponseKeysDto;
import com.digiconnect.mockapiforpoc.client.repository.FileInformationRepository;
import com.digiconnect.mockapiforpoc.client.repository.ResponseKeysRepository;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
public class ResponseKeysService {

    private final ResponseKeysRepository responseKeysRepository;
    private final FileInformationRepository fileInformationRepository;

    public ResponseKeysService(ResponseKeysRepository responseKeysRepository, FileInformationRepository fileInformationRepository) {
        this.responseKeysRepository = responseKeysRepository;
        this.fileInformationRepository = fileInformationRepository;
    }


    public ResponseEntity addNewResponseKeys(List<ResponseKeysDto> responseKeysDtos) throws EntityDoesNotExistsException {


        List<ResponseKeysDto> addedKeys = new ArrayList<>();


        for (ResponseKeysDto responseKeysDto : responseKeysDtos) {
            String responseKey = responseKeysDto.getResponseKey();
            Long fileInformationId = responseKeysDto.getFileInformationId();


            Optional<FileInformation> fileInformationRepositoryById = fileInformationRepository.findById(fileInformationId);
            if (fileInformationRepositoryById.isEmpty()) {
                throw new EntityDoesNotExistsException("fileInformationId: " + fileInformationId);
            }


            ResponseKeys responseKeysFromDb = responseKeysRepository.findResponseKeysByResponseKeyAndFileInformationId(responseKey, fileInformationId);
            if (responseKeysFromDb != null) {
                continue;
            }


            addedKeys.add(responseKeysDto);


            ResponseKeys responseKeys = ResponseKeys.builder().id(UUID.randomUUID().toString()).responseKey(responseKey).fileInformation(fileInformationRepositoryById.get()).build();

            responseKeysRepository.save(responseKeys);
        }

        return new ResponseEntity(addedKeys, HttpStatus.OK);

    }
}
