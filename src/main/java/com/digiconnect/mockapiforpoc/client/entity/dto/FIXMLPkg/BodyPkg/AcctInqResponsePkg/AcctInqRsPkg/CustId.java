package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.AcctType;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.CustIdPkg.PersonName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustId {

    @XmlValue
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    String custId;

    @XmlValue
    @OneToMany(targetEntity = PersonName.class, cascade = CascadeType.ALL, orphanRemoval = true)
    List<PersonName> personNameList;
}
