package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.KeyHandler;
import com.digiconnect.mockapiforpoc.client.repository.KeyHandlerRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;
import java.util.List;

@Service
public class KeyHandlerService extends KeyHandler{
    @Autowired
    private KeyHandlerRepository keyHandlerRepository;


    public KeyHandler createKey(KeyHandler keyHandler){
        return keyHandlerRepository.save(keyHandler);
    }

    public List<KeyHandler> createKeys(List<KeyHandler> keyHandlers){
        return keyHandlerRepository.saveAll(keyHandlers);
    }



    public KeyHandler retrieveById(int id){
        return keyHandlerRepository.findById(id).orElse(null);
    }

    public List<KeyHandler> retrieveAll(){
        return keyHandlerRepository.findAll();
    }

    public String removeById(int id){
        keyHandlerRepository.deleteById(id);
        return "ID removed: " + id;
    }

    public KeyHandler editKey(KeyHandler keyHandler){
        KeyHandler existingKey = keyHandlerRepository.findById(keyHandler.getId()).orElse(null);
        existingKey.setKey(keyHandler.getKey());
        existingKey.setFileName(keyHandler.getFileName());
        return keyHandlerRepository.save(existingKey);
    }

    //Testing
//    @XmlAttribute
//    public List<KeyHandler> getALLKeys(){
//        KeyHandler keyHandler1= new KeyHandler(1, "hello", "file1");
//        KeyHandler keyHandler2= new KeyHandler(2, "hi", "file2");
//        List<KeyHandler> list= new ArrayList<>();
//        list.add(keyHandler1);
//        list.add(keyHandler2);
//        return list;
//
//    }
}
