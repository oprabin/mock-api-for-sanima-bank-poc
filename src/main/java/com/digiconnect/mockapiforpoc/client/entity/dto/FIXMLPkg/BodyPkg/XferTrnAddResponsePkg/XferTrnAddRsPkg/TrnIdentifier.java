package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponsePkg.XferTrnAddRsPkg;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class TrnIdentifier {

    @XmlValue
    String trnDt;

    @XmlValue
    String trnId;
    
}
