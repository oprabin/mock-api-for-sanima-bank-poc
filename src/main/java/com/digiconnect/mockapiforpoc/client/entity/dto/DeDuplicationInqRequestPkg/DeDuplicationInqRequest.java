package com.digiconnect.mockapiforpoc.client.entity.dto.DeDuplicationInqRequestPkg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import java.sql.Time;

@Data
@AllArgsConstructor
@XmlType(
        propOrder = {
                "FirstName", "LastName", "MiddleName", "BirthDt", "Phone","City","CTZNO"
        }
)
public class DeDuplicationInqRequest {

    @XmlValue
    String FirstName;
    @XmlValue
    String LastName;
    @XmlValue
    String MiddleName;
    @XmlValue
    String BirthDt;
    @XmlValue
    String Phone;
    @XmlValue
    String City;
    @XmlValue
    Integer CTZNO;





}
