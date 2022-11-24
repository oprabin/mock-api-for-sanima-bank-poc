package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.SecurityPkg.Token;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class Security {
    
    @XmlAttribute
    Token Token;

    @XmlValue
    String FICertToken;

    @XmlValue
    String RealUserLoginSessionId;

    @XmlValue
    String RealUser;

    @XmlValue
    String RealUserPwd;

    @XmlValue
    String SSOTransferToken;
}
