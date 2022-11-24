package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRs;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInq_CustomData;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement
@Builder
@AllArgsConstructor
@Data
public class AccInqResponse {

    @XmlAttribute
    AcctInqRs acctInqRs;

    @XmlAttribute
    AcctInq_CustomData acctInq_customData;


}
