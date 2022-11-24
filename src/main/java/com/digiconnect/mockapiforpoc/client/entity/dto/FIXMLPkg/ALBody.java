package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequest;

import lombok.AllArgsConstructor;
import lombok.Data;

@XmlRootElement
@AllArgsConstructor
@Data
public class ALBody {
    
    @XmlAttribute
    AcctLienAddRequest AcctLienAddRequest;
}
