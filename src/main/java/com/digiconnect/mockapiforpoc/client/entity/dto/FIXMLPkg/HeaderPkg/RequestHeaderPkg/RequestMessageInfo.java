package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class RequestMessageInfo {
    @XmlValue
    String BankId;
    @XmlValue
    String TimeZone;
    @XmlValue
    String EntityId;
    @XmlValue
    String EntityType;
    @XmlValue
    String ArmCorrelationId;
    @XmlValue
    String MessageDateTime;
}
