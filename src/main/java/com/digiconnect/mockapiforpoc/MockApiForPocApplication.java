package com.digiconnect.mockapiforpoc;

import com.digiconnect.mockapiforpoc.client.entity.dto.DeDuplicationInqRequestPkg.DeDuplicationInqRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableWebMvc
//@EnableSwagger2
public class MockApiForPocApplication {

    public static String getResponse(){
        DeDuplicationInqRequest deDuplicationInqRequest = new DeDuplicationInqRequest("ANUP","MAHARJAN","1987-11-19T00:00:00.000", "+977(01)9849060181","KTM","KTM",16777);
        String result = deDuplicationInqRequest.getFirstName() + deDuplicationInqRequest.getLastName()+ deDuplicationInqRequest.getMiddleName();
        return result;
    }
    public static void main(String[] args) {
        SpringApplication.run(MockApiForPocApplication.class, args);

        getResponse();
    }

}
