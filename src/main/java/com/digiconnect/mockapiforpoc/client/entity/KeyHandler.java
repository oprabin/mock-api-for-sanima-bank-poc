package com.digiconnect.mockapiforpoc.client.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@XmlRootElement
public class KeyHandler {

    @Id
    @GeneratedValue
    @XmlAttribute
    private int id;
    @XmlAttribute
    private String key;
    @XmlAttribute
    private String fileName;





}
