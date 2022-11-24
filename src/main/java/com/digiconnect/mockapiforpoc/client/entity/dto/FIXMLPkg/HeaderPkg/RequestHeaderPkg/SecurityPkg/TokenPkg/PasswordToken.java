package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.SecurityPkg.TokenPkg;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class PasswordToken {
    
    @XmlValue
    String UserId;
    @XmlValue
    String Password;
}
