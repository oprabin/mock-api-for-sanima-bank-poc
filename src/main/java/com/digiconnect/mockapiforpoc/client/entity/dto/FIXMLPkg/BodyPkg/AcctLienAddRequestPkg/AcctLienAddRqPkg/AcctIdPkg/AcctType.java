package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.AcctIdPkg;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class AcctType {
    @XmlValue
    String SchmCode;
    @XmlValue
    String SchmType;
}
