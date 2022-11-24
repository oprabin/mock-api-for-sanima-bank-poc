package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.dto.FIXML;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Body;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Header;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeader;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg.RequestMessageKey;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg.ResponseMessageInfo;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg.UBUSTransaction;
import org.springframework.stereotype.Service;

@Service
public class BIService {
    public FIXML returnResponse(String requestString){
        if(requestString.equals("true")){

            RequestMessageKey requestMessageKey = new RequestMessageKey("Req_1631522903937","AcctInq","10.2","COR");
            ResponseMessageInfo responseMessageInfo = new ResponseMessageInfo("01", "", "2021-09-13T08:51:47.308");
            UBUSTransaction ubusTransaction = new UBUSTransaction();
            ResponseHeader responseHeader = new ResponseHeader(requestMessageKey, responseMessageInfo, ubusTransaction, null, null, requestString);
            Header header = new Header(responseHeader);
            // ResponseHeader responseHeader = new ResponseHeader();
            FIXML fixml = new FIXML("a","b","c",header,new Body());
            fixml.setXmlns("a");
            fixml.setXsi("B");
            fixml.setSchemaLocation("s");
            
            Body body = new Body();
//            body.setAccInqResponse(new AccInqResponse(new AcctInqRs()));
            fixml.setBody(body);

            // Header header = new Header();
            // ResponseHeader responseHeader = new ResponseHeader(requestMessageKey,responseMessageInfo,ubusTransaction,null,null,null);

            header.setResponseHeader(responseHeader);

            fixml.setHeader(header);
            return fixml;}
        return new FIXML(null,null,null, null, null);
    }
}
