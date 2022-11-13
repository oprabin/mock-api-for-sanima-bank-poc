package com.digiconnect.mockapiforpoc.client.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientConfig {

    @Id
    private String uuid;

    @NotNull
    private String clientId;

    @NotNull
    private String clientName;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ResponseKeys> responseKeys;

}
