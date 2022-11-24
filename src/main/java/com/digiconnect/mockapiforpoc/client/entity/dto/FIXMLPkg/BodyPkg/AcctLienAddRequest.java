package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRq;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class AcctLienAddRequest {

    @XmlAttribute
    AcctLienAddRq AcctLienAddRq;
}
