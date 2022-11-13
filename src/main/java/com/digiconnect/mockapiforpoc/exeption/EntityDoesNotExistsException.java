package com.digiconnect.mockapiforpoc.exeption;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

public class EntityDoesNotExistsException extends Exception {
    public EntityDoesNotExistsException(String message) {
        super(message + " does not exists.");
    }
}
