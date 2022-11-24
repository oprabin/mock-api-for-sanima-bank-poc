package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement
@Builder
@AllArgsConstructor
@Data
public class ResponseHeader {

    @XmlAttribute
    RequestMessageKey requestMessageKey;

    @XmlAttribute
    ResponseMessageInfo responseMessageInfo;

    @XmlAttribute
    UBUSTransaction ubusTransaction;

    @XmlAttribute
   HostTransaction hostTransaction;

    @XmlAttribute
    HostParentTransaction hostParentTransaction;

    @XmlValue
    String customInfo;
}
