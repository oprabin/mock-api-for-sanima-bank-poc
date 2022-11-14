package com.digiconnect.mockapiforpoc.client.repository;

import com.digiconnect.mockapiforpoc.client.entity.ResponseKeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Repository
public interface ResponseKeysRepository extends JpaRepository<ResponseKeys, String> {






    public ResponseKeys findByResponseKey(String responseKey);

    public Optional<ResponseKeys> findResponseKeysByResponseKeyAndFileInformationId(String responseKey, Long fileInformationId);





}
