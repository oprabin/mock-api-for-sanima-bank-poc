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
@Builder
@AllArgsConstructor
@Data
public class AcctInqRs {


    @XmlAttribute
   AcctId acctId;

    @XmlAttribute
    CustId custId;

    @XmlValue
    String acctOpenDt;

    @XmlValue
    String bankAcctStatusCode;

    @XmlAttribute
    List<AcctBal> acctBal;






}
