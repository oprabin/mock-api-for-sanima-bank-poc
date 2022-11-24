package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.dto.AccountTransfer.FIXML;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.ATBody;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponse;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponsePkg.XferTrnAddRs;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.XferTrnAddResponsePkg.XferTrnAddRsPkg.TrnIdentifier;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Header;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeader;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
//import org.json.JSONObject;
//import org.json.XML;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Slf4j
@Service
public class ATService {
    public FIXML returnResponse(String requestString){
        if(requestString.toLowerCase().contains("xfertrnadd.xsd")){

            RequestMessageKey requestMessageKey = new RequestMessageKey("Req_1631478249","XferTrnAdd","10.2","COR");
            ResponseMessageInfo responseMessageInfo = new ResponseMessageInfo("01", "", "2021-09-13T09:13:10.092");
            UBUSTransaction ubusTransaction = new UBUSTransaction();
            HostTransaction hostTransaction = new HostTransaction();
            hostTransaction.setStatus("SUCCESS");
            HostParentTransaction hostParentTransaction = new HostParentTransaction();
            ResponseHeader responseHeader = new ResponseHeader(requestMessageKey, responseMessageInfo, ubusTransaction, hostTransaction, hostParentTransaction, "");
            
            Header header = new Header(responseHeader);
            // String thisisastring = header.toString();
            // System.out.println("\n"+header);
            // ResponseHeader responseHeader = new ResponseHeader();
            FIXML fixml = new FIXML("a","b","c",header,new ATBody());
            fixml.setXmlns("http://www.finacle.com/fixml");
            fixml.setXsi("http://www.w3.org/2001/XMLSchema-instance");
            fixml.setSchemaLocation("http://www.finacle.com/fixml XferTrnAdd.xsd");
            
            TrnIdentifier trnIdentifier = new TrnIdentifier("2021-09-13T00:00:00.000", "TX9717");
            XferTrnAddRs xferTrnAddRs = new XferTrnAddRs(trnIdentifier);
            XferTrnAddResponse xferTrnAddResponse = new XferTrnAddResponse(xferTrnAddRs, "");

            ATBody body = new ATBody(xferTrnAddResponse);



            fixml.setBody(body);

            // Header header = new Header();
            // ResponseHeader responseHeader = new ResponseHeader(requestMessageKey,responseMessageInfo,ubusTransaction,null,null,null);

            header.setResponseHeader(responseHeader);

            fixml.setHeader(header);
            // returnString();
            return fixml;
        }
        return new FIXML(null,null,null, null, null);
    }

//    public String returnString(String requestString) throws JAXBException{
//
//        FIXML fixml =  returnResponse(requestString);
//
//        JSONObject xmlJSONObj = XML.toJSONObject(requestString);
//        String jsonPrettyPrintString = xmlJSONObj.toString();
//
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            JsonNode jsonNode = mapper.readTree(xmlJSONObj.toString());
//
//            List<String> keys = new ArrayList<>();
//
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//
//        Set<String> keys = xmlJSONObj.keySet();
//log.info(jsonPrettyPrintString);
//        xmlJSONObj.get("FIXML");
//
//        log.info(keys.toString());
//
//        List<String> keyss = getAllKeysUsingJsonNodeFieldNames(xmlJSONObj.toString());
//        log.info(keyss.toString());
//        // JAXBContext jaxbContext = JAXBContext.newInstance(requestString.getClass());
//        // Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//
//        // StreamResult result = new StreamResult();
//
//        // jaxbMarshaller.marshal(fixml, result);
//
//        // System.out.println(result.toString());
//
//
//
//        // fixml.class.
//        // Node node = (Node) fixml;
//        // System.out.println(node.getLastChild());
//
//
//
//        // System.out.println("\n" + RequestMessageKey.class.getTypeName());
//
//
//// String[]split_string = fixmlString.split("\\(");
//
//        String fixmlString = fixml.toString();
//        log.info(fixmlString);
//        return fixmlString;
//    }

    private List<String> getAllKeysUsingJsonNodeFieldNames(String jsonNode){
        List<String> keys = new ArrayList<>();
        JsonFactory factory = new JsonFactory();
        JsonParser jsonParser = null;
        try {
            jsonParser = factory.createParser(jsonNode);

        while (!jsonParser.isClosed()) {
            if (jsonParser.nextToken() == JsonToken.FIELD_NAME) {
                keys.add((jsonParser.getCurrentName()));
                //map<string, list<sitrng>>
            }
        }
        return keys;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
