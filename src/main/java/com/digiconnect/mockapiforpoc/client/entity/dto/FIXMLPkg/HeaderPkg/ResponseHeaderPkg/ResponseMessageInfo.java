package com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg;

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

import java.util.Date;

@XmlRootElement
// @Builder
// @Entity
// @NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseMessageInfo {


    @XmlValue
    String bankId;
    @XmlValue
    String timeZone;
    @XmlValue
    String messageDateTime;
}
