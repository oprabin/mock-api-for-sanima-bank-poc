package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.BankInfoPkg.PostAddr;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;
import java.util.List;

@XmlRootElement
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BankInfo {


    @XmlValue
    Integer bankId;

    @XmlValue
    String name;

    @XmlValue
    String branchId;

    @XmlValue
    String branchName;

    @XmlAttribute
    PostAddr postAddr;
}
