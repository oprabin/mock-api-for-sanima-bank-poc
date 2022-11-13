package com.digiconnect.mockapiforpoc.client.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseKeysDto {

    @NotNull
    private String responseKey;

    @NotNull
    private Long fileInformationId;

}
