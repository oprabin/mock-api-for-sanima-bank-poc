package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.dto.AddLien.FIXML;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.ALBody;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.ALHeader;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctInqResponsePkg.AcctInqRsPkg.AcctIdPkg.AcctType;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequest;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRq;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.AcctId;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.LienDtls;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.BodyPkg.AcctLienAddRequestPkg.AcctLienAddRqPkg.LienDtlsPkg.NewLienAmt;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeader;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.MessageKey;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.RequestMessageInfo;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.Security;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.SecurityPkg.Token;
import com.digiconnect.mockapiforpoc.client.entity.dto.FIXMLPkg.HeaderPkg.RequestHeaderPkg.SecurityPkg.TokenPkg.PasswordToken;
import org.springframework.stereotype.Service;

@Service
public class ALService {
    public FIXML returnResponse(String requestString){
        if(requestString.toLowerCase().contains("acctlienadd.xsd")){

            MessageKey MessageKey = new MessageKey("Req_1616300610093", "AcctLienAdd", "10.2", "COR", "");
            RequestMessageInfo RequestMessageInfo = new RequestMessageInfo("", "", "", "", "", "2021-02-21T10:08:30.093");
            PasswordToken PasswordToken = new PasswordToken("", "");
            
            Token Token = new Token(PasswordToken);

            Security Security = new Security(Token, "", "", "", "", "");

            RequestHeader RequestHeader = new RequestHeader(MessageKey, RequestMessageInfo, Security);

            ALHeader Header = new ALHeader(RequestHeader);

            
            AcctType AcctType = new AcctType("SBGEN","SBGEN");
            AcctId AcctId = new AcctId("001011100000005", AcctType, "NPR");

            NewLienAmt NewLienAmt = new NewLienAmt("1000", "NPR");

            LienDtls LienDtls = new LienDtls(NewLienAmt, "ASBA", "TEST");

            AcctLienAddRq AcctLienAddRq = new AcctLienAddRq(AcctId, "ULIEN", LienDtls);

            AcctLienAddRequest AcctLienAddRequest = new AcctLienAddRequest(AcctLienAddRq);

            ALBody Body = new ALBody(AcctLienAddRequest);

            FIXML fixml = new FIXML("http://www.finacle.com/fixml AcctLienAdd.xsd","http://www.finacle.com/fixml","http://www.w3.org/2001/XMLSchema-instance",Header,Body);

            return fixml;}
        return new FIXML(null,null,null, null, null);
    }
}
