package com.digiconnect.mockapiforpoc.client.repository;

import com.digiconnect.mockapiforpoc.client.entity.ClientConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Repository
public interface ClientConfigRepository extends JpaRepository<ClientConfig, String> {


    public boolean existsClientConfigByClientId(String clientId);


//    Optional<ClientConfig> findClientConfigByClientId(String clientId);

    public Optional<ClientConfig> findClientConfigByClientId(String clientId);



}
