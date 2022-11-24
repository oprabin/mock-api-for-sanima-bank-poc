package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.BankInfoPkg.PostAddr;
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
public class BankInfo {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @XmlValue
    int bankId;

    @XmlValue
    String name;

    @XmlValue
    String branchId;

    @XmlValue
    String branchName;

    @XmlValue
    @OneToMany(targetEntity = PostAddr.class, cascade = CascadeType.ALL, orphanRemoval = true)
    List<PostAddr> postAddrList;
}
