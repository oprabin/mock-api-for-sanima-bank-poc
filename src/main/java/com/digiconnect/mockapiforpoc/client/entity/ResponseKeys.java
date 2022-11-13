package com.digiconnect.mockapiforpoc.client.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseKeys {

    @Id
    private String id;

    @NotNull
    private String responseKey;
}
