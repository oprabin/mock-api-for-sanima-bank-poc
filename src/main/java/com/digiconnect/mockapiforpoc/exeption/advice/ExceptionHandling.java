package com.digiconnect.mockapiforpoc.exeption.advice;

import com.digiconnect.mockapiforpoc.base.ExceptionHandlerDto;
import com.digiconnect.mockapiforpoc.exeption.EntityAlreadyExistsException;
import com.digiconnect.mockapiforpoc.exeption.EntityDoesNotExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@ControllerAdvice
public class ExceptionHandling {


    @ExceptionHandler(value = {EntityAlreadyExistsException.class})
    public ResponseEntity<ExceptionHandlerDto> handleEntityAlreadyExistsException(EntityAlreadyExistsException exception) {

        ExceptionHandlerDto handlerDto = ExceptionHandlerDto.builder()
                .errorMessage(exception.getMessage())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .build();

        return new ResponseEntity<>(handlerDto, handlerDto.getHttpStatus());
    }

    @ExceptionHandler(value = {EntityDoesNotExistsException.class})
    public ResponseEntity<ExceptionHandlerDto> handleEntityEntityDoesNotExistsException(EntityDoesNotExistsException exception) {

        ExceptionHandlerDto handlerDto = ExceptionHandlerDto.builder()
                .errorMessage(exception.getMessage())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .build();

        return new ResponseEntity<>(handlerDto, handlerDto.getHttpStatus());
    }
}
