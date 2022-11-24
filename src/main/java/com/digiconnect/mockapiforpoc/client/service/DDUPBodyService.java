package com.digiconnect.mockapiforpoc.client.service;

import com.digiconnect.mockapiforpoc.client.entity.dto.DDUPBody;
import com.digiconnect.mockapiforpoc.client.entity.dto.DeDuplicationInqRequestPkg.DeDuplicationInqRequest;
import org.springframework.stereotype.Service;

@Service
public class DDUPBodyService {
    String fileName = "DeDuplicationInq.xsd";
    public DDUPBody getDDUPXML(String requestString){
        if(requestString.equals(fileName)){
            DeDuplicationInqRequest deDuplicationInqRequest = new DeDuplicationInqRequest("ANUP","MAHARJAN","1987-11-19T00:00:00.000", "+977(01)9849060181","KTM","KTM",16777);
            DDUPBody ddupBody= new DDUPBody();
            ddupBody.setDeDuplicationInqRequest(deDuplicationInqRequest);
            return ddupBody;
        }
        return new DDUPBody();

    }

    public String getPojoString(){

        return "";
    }

}
