package com.digiconnect.mockapiforpoc.client.entity.dto;

import com.digiconnect.mockapiforpoc.client.entity.ResponseKeys;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientAndResponseKeysDto {

    private String clientId;
    private String clientName;
    private List<ResponseKeys> responseKeys;


}
