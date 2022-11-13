package com.digiconnect.mockapiforpoc.app.inquiry.controller;

import com.digiconnect.mockapiforpoc.app.utils.XmlUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

import static com.digiconnect.mockapiforpoc.base.BaseInterface.INQUIRY_CONTROLLER_BASE_CONTEXT;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

@RestController
@RequestMapping(INQUIRY_CONTROLLER_BASE_CONTEXT)
public class InquiryController {

    @GetMapping(value = "/test")
    public String test(){
        return "Works.";
    }



    @GetMapping(produces = MediaType.APPLICATION_XML_VALUE, value = "/readInquiryResponseFromFile")
    public String readInquiryResponseFromFile() throws IOException, ParserConfigurationException, SAXException {
        String xmlDocument = XmlUtils.readXmlFromDocument("/home/oprabin/Documents/Projects/dev/intellij-workspace/sanima-bank/mock-api-for-poc/src/main/resources/templates/inquiry-response.xml");

        return xmlDocument;
    }




}
