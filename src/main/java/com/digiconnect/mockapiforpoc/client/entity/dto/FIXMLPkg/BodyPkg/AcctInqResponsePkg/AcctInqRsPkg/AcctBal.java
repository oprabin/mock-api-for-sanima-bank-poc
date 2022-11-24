package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctBalPkg.BalAmt;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.BankInfo;
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
public class AcctBal {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    @XmlValue
    String balType;


    @XmlValue
    @OneToMany(targetEntity = BalAmt.class, cascade = CascadeType.ALL, orphanRemoval = true)
    List<BalAmt> balAmtList;
}
