package com.digiconnect.mockapiforpoc.app.utils;

import io.swagger.v3.oas.models.media.XML;
import org.hibernate.internal.util.xml.XmlDocument;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

/**
 * User: oprabin
 * Date: 2022-11-13
 * Created with IntelliJ IDEA Ultimate
 */

public class XmlUtils {


    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        XmlUtils.readXmlFromDocument("/home/oprabin/Documents/Projects/dev/intellij-workspace/sanima-bank/mock-api-for-poc/src/main/resources/templates/inquiry-response.xml");
    }


    public static String readXmlFromDocument(String fileName) throws IOException, ParserConfigurationException, SAXException {

        File xmlFile = new File(fileName);
        Reader fileReader = new FileReader(xmlFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        StringBuilder stringBuilder = new StringBuilder();
        String line = bufferedReader.readLine();
        while (line != null){
            stringBuilder.append(line).append("\n");
            line = bufferedReader.readLine();
        }

        String stringFromXml = stringBuilder.toString();
        System.out.println("After BufferedReader: \n" + stringFromXml);

        bufferedReader.close();

        return stringFromXml;

    }


}
