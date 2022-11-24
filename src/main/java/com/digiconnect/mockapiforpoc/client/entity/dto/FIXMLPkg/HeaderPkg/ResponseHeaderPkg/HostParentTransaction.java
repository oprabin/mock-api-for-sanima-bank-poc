package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class HostParentTransaction {

    @XmlValue
    Integer id;
    @XmlValue
    String status;
}
