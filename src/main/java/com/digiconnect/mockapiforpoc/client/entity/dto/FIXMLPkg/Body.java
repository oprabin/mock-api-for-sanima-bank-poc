package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AccInqResponse;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeader;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;


@Builder
@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Body {

    @XmlAttribute
    AccInqResponse accInqResponse;
}
