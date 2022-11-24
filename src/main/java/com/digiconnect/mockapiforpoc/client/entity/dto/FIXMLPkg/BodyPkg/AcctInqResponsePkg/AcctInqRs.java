package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctBal;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctId;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.CustId;
import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.Date;
import java.util.List;

@XmlRootElement
@AllArgsConstructor
@Data
public class AcctInqRs {

    @XmlAttribute
    AcctId AcctId;

    @XmlAttribute
    CustId CustId;

    @XmlValue
    String AccOpenDt;

    @XmlValue
    String BankAcctStatusCode;

    @XmlAttribute
    AcctBal AcctBal;

    @XmlValue
    String acctOpenDt;

    @XmlAttribute
    AcctInq_CustomData AcctInq_customData;


}
