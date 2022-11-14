package com.digiconnect.mockapiforpoc.client.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.util.List;

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
public class ClientToResponseKeys {

    @Id
    private String id;

    @OneToOne
    @NotNull
    private ClientConfig clientConfig;

    @OneToMany
    @NotNull
    private List<ResponseKeys> responseKeys;

}
