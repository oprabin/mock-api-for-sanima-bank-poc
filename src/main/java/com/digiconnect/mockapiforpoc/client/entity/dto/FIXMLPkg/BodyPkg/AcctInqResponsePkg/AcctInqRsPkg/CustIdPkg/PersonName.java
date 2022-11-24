package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.CustIdPkg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonName {

    @XmlValue
    String lastName;
    @XmlValue
    String firstName;
    @XmlValue
    String middleName;
    @XmlValue
    String name;
    @XmlValue
    String titlePrefix;
}
