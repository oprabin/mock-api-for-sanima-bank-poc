package com.digiconnect.mockapiforpoc.client.controller;

import com.digiconnect.mockapiforpoc.client.entity.KeyHandler;
import com.digiconnect.mockapiforpoc.client.service.KeyHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "/xml-output",
//        produces = "application/xml")
public class KeyHandlerController {

    @Autowired
    private KeyHandlerService keyHandlerService;

    @PostMapping ("/postKey")
    public KeyHandler postKey(@RequestBody KeyHandler keyHandler){
         return keyHandlerService.createKey(keyHandler);
    }

    @PostMapping ("/postKeys")
    public List<KeyHandler> postKeys(@RequestBody List<KeyHandler> keyHandlers){
        return keyHandlerService.createKeys(keyHandlers);
    }

    @GetMapping("/getKey/{id}")
    public KeyHandler getKeyById(@PathVariable int id){
        return  keyHandlerService.retrieveById(id);
    }

    @GetMapping("/getKeys")
    public  List<KeyHandler> getKeys(){
        return  keyHandlerService.retrieveAll();
    }

    @PutMapping("/putKey")
    public KeyHandler putKey(@RequestBody KeyHandler keyHandler){
        return  keyHandlerService.editKey(keyHandler);
    }

    @DeleteMapping("/deleteKey/{id}")
    public  String deleteKey(@PathVariable int id){
        return  keyHandlerService.removeById(id);
    }

//    @GetMapping("/xmlReq")
//    public List<KeyHandler> getXML(){
//        return keyHandlerService.getALLKeys();
//    }


}
