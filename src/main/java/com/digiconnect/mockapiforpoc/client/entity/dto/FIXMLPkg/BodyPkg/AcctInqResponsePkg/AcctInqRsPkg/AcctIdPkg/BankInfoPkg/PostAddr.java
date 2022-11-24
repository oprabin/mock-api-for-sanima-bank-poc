package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.BankInfoPkg;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostAddr {


    String addr1;
    String addr2;
    String addr3;
    String city;
    String stateProv;
    String postalCode;
    String country;
    String addrType;
}
