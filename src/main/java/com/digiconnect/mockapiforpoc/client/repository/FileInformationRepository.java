package com.digiconnect.mockapiforpoc.client.repository;

import com.digiconnect.mockapiforpoc.client.entity.FileInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Repository
public interface FileInformationRepository extends JpaRepository<FileInformation, Long> {


//    public boolean existsClientConfigByClientId(String clientId);




    public Optional<FileInformation> findById(Long id);



}
