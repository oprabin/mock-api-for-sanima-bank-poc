package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctBalPkg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BalAmt {

    @XmlValue
    Double amountValue;
    @XmlValue
    String currencyCode;
}
