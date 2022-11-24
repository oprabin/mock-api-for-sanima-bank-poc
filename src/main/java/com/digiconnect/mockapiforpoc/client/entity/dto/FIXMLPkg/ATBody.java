package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ATBody {
    @XmlAttribute
    XferTrnAddResponse xferTrnAddResponse;
}
