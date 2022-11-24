package com.digiconnect.mockapiforpoc.client.entity.dto.AccountTransfer;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Body;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Header;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.ATBody;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@AllArgsConstructor
@Data
public class FIXML {

    @XmlValue
    String schemaLocation;
    @XmlValue
    String xmlns;
    @XmlValue
    String xsi;

    @XmlAttribute
    Header header;

    @XmlAttribute
    ATBody body;
}
