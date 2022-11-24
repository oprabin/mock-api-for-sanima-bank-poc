package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.LienDtlsPkg.NewLienAmt;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class LienDtls {

    @XmlAttribute
    NewLienAmt newLienAmt;

    @XmlValue
    String ReasonCode;

    @XmlValue
    String Rmks;
}
