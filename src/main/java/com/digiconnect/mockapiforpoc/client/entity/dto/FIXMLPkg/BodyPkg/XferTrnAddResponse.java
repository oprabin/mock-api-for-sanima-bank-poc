package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponsePkg.XferTrnAddRs;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class XferTrnAddResponse {

    @XmlAttribute
    XferTrnAddRs XferTrnAddRs;

    @XmlValue
    String xferTrnAdd_CustomData;
    
}
