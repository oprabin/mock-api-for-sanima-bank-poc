package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponsePkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponsePkg.XferTrnAddRsPkg.TrnIdentifier;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class XferTrnAddRs {
    
    @XmlAttribute
    TrnIdentifier trnIdentifier;
}
