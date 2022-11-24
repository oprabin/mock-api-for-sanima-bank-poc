package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.LienDtls;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.AcctId;
import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class AcctLienAddRq {
    
    @XmlAttribute
    AcctId AcctId;

    @XmlValue
    String ModuleType;

    @XmlAttribute
    LienDtls LienDtls;
}
