package com.digiconnect.mockapiforpoc.client.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientToResponseKeysDto {

    private String clientId;
//    private String responseKey;
//    private Long fileInformationId;


    private Map<String, Long> responseKeyToFileInformationId;


}
