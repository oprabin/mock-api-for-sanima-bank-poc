package com.digiconnect.mockapiforpoc.client.repository;

import com.digiconnect.mockapiforpoc.client.entity.ClientToResponseKeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * User: oprabin
 * Date: 2022-11-14
 * Created with IntelliJ IDEA Ultimate
 */

@Repository
public interface ClientToResponseKeysRepository extends JpaRepository<ClientToResponseKeys, String> {

}
