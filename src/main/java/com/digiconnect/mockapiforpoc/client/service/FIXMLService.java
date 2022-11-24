package com.digiconnect.mockapiforpoc.client.service;


import com.digiconnect.mockapiforpoc.client.entity.dto.FIXML;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Body;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AccInqResponse;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRs;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctBal;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctBalPkg.BalAmt;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctId;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.AcctType;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.BankInfo;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.BankInfoPkg.PostAddr;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.CustId;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.CustIdPkg.PersonName;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInq_CustomData;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.Header;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeader;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.ResponseHeaderPkg.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FIXMLService {

    String fileName = "AcctInq.xsd";
    public FIXML getAllFIXML(String requestString){
        if(requestString.equals(fileName)){


            FIXML fixml = new FIXML();

            //Response Header
            RequestMessageKey requestMessageKey = new RequestMessageKey("Req_1631522903937","AcctInq","10.2","COR");
            ResponseMessageInfo responseMessageInfo = new ResponseMessageInfo("01", "", "2021-09-13T08:51:47.308");
            UBUSTransaction ubusTransaction = new UBUSTransaction(null,null);
            HostTransaction hostTransaction = new HostTransaction(null,"SUCCESS");
            HostParentTransaction hostParentTransaction= new HostParentTransaction(null,null);




            //Header

            Header header = new Header();
            ResponseHeader responseHeader = new ResponseHeader(requestMessageKey,responseMessageInfo,ubusTransaction,null,null,null);
            header.setResponseHeader(responseHeader);
            fixml.setHeader(header);

            //AccId Part
            AcctType acctType = new AcctType("SBSTF", "SBA");
            PostAddr postAddr = new PostAddr(null,null,null,null,null,null,null,null);
            BankInfo bankInfo = new BankInfo(null, null,"001", null, postAddr);

            //First part of AcctInqResponse: AccInqRs
            AcctId acctId = new AcctId("001011160000148", acctType, "NPR", bankInfo);


            //-------
            //CustId Part
            PersonName personName = new PersonName(null,null,null,"ANUP KUMAR MAHARJAN","MR.");
            CustId custId= new CustId("R000192682",personName);

            //----------
            //AcctBal Part
            //1

            List<AcctBal> acctBal = new ArrayList<>();

            BalAmt balAmt1 = new BalAmt(347.48, null);
            BalAmt balAmt2 = new BalAmt(347.48, null);
            BalAmt balAmt3 = new BalAmt(347.48, null);
            BalAmt balAmt4 = new BalAmt(0.00, null);
            BalAmt balAmt5 = new BalAmt(0.00, null);
            BalAmt balAmt6 = new BalAmt(0.00, null);
            BalAmt balAmt7 = new BalAmt(347.48, "NPR");
            BalAmt balAmt8 = new BalAmt(0.00, "NPR");
            BalAmt balAmt9 = new BalAmt(0.00, "NPR");


            AcctBal acctBal1 = new AcctBal("LEDGER",balAmt1);
            AcctBal acctBal2 = new AcctBal("AVAIL",balAmt2);
            AcctBal acctBal3 = new AcctBal("EFFAVL",balAmt3);
            AcctBal acctBal4 = new AcctBal("FLOAT",balAmt4);
            AcctBal acctBal5 = new AcctBal("LIEN",balAmt5);
            AcctBal acctBal6 = new AcctBal("DRWPWR",balAmt6);
            AcctBal acctBal7 = new AcctBal("ACCBAL",balAmt7);
            AcctBal acctBal8 = new AcctBal("SHADOW",balAmt8);
            AcctBal acctBal9 = new AcctBal("FUTBAL",balAmt5);



            acctBal.add(acctBal1);
            acctBal.add(acctBal2);
            acctBal.add(acctBal3);
            acctBal.add(acctBal4);
            acctBal.add(acctBal5);
            acctBal.add(acctBal6);
            acctBal.add(acctBal7);
            acctBal.add(acctBal8);
            acctBal.add(acctBal9);


            AcctInqRs acctInqRs = new AcctInqRs(acctId,custId, "2014-03-09T00:00:00.000","A",acctBal);


            //Second part of AcctInqResponse: AcctInq_CustomData
            AcctInq_CustomData acctInq_customData = new AcctInq_CustomData("SANIMA STAFF SAVING");

            Body body = new Body();
            AccInqResponse accInqResponse= new AccInqResponse(acctInqRs,acctInq_customData);
            body.setAccInqResponse(accInqResponse);
            fixml.setBody(body);

            return fixml;
        }
        return new FIXML();
    }



    public String getStringResponse(String requestString) throws JAXBException {
        FIXML fixmlObj = getAllFIXML(requestString);

        JAXBContext jaxbContext = JAXBContext.newInstance(FIXML.class);
        String fixmlString = fixmlObj.toString();
        System.out.println(fixmlString);
        return fixmlString;
    }
    }


