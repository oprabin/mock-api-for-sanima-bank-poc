package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.MessageKey;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.RequestMessageInfo;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.Security;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class RequestHeader {
    
    @XmlAttribute
    MessageKey MessageKey;

    @XmlAttribute
    RequestMessageInfo RequestMessageInfo;

    @XmlAttribute
    Security Security;
}
