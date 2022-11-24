package com.digiconnect.mockapiforpoc.client.entity.dto;

import com.digiconnect.mockapiforpoc.client.entity.dto.DeDuplicationInqRequestPkg.DeDuplicationInqRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "Body")
public class DDUPBody {

    @XmlAttribute
    DeDuplicationInqRequest deDuplicationInqRequest;



}
