package com.digiconnect.mockapiforpoc.client.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileInformation {

    @Id
    private Long id;
    private String fileName;


}
