package com.digiconnect.mockapiforpoc.client.repository;

import com.digiconnect.mockapiforpoc.client.entity.KeyHandler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface KeyHandlerRepository extends JpaRepository<KeyHandler, Integer> {

}
