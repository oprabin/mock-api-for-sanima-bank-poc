package com.digiconnect.mockapiforpoc.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExceptionHandlerDto {
    private String errorMessage;
    private HttpStatus httpStatus;
}
