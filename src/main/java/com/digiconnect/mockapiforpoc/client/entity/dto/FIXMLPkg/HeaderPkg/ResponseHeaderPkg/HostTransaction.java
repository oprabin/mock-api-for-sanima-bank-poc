package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.sql.In;

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
public class HostTransaction {

    @XmlValue
    Integer id;
    @XmlValue
    String status;
}
