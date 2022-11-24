package com.digiconnect.mockapiforpoc.client.entity.dto;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Body;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Header;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "FIXML", namespace = "http://www.finacle.com/fixml AcctInq.xsd")
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FIXML {

    @XmlAttribute
    Header header;

    @XmlElement
    Body body;


}
