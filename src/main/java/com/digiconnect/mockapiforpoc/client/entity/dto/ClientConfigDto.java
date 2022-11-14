package com.digiconnect.mockapiforpoc.client.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
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
public class ClientConfigDto {

    @NotNull
    private String clientId;

    @NotNull
    private String clientName;

    private List<String> responseKeys;

}
