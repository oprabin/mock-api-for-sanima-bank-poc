package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class MessageKey {
    
    @XmlValue
    String RequestUUID;
    @XmlValue
    String ServiceRequestId;
    @XmlValue
    String ServiceRequestVersion;
    @XmlValue
    String ChannelId;
    @XmlValue
    String LanguageId;
}
