/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaxmlproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author 70060462
 */
public class DataFiller {
    private Weather watehr;
    private Location location;
    Document WeatherDoc;
    Document LocationDoc;

    public DataFiller() throws FileNotFoundException, ParserConfigurationException, SAXException, IOException {
        this.watehr = watehr;
        this.location = location;
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        WeatherDoc = builder.parse(new FileInputStream("weather.xml"));
        LocationDoc =  builder.parse(new FileInputStream("location.xml"));    
    }
    public Location fillLocationData() throws XPathExpressionException
    {
        Location location=new Location();
        String ExtendedNameExpression = "/GeocodeResponse/result/formatted_address/text()";
        String LatitudeExpression = "/GeocodeResponse/result/geometry/location/lat/text()";
        String LongitudeExpression = "/GeocodeResponse/result/geometry/location/lng/text()";
        String ShortNameExpression = "/GeocodeResponse/result/address_component/short_name/text()";
 
        XPath xPath =  XPathFactory.newInstance().newXPath();
        //read a string value
        location.setExtendedName(xPath.compile(ExtendedNameExpression).evaluate(LocationDoc));
        
        location.setLatitude(Float.parseFloat(xPath.compile(LatitudeExpression).evaluate(LocationDoc)));
        
        location.setLongitude(Float.parseFloat(xPath.compile(LongitudeExpression).evaluate(LocationDoc)));
        
        location.setName(xPath.compile(ShortNameExpression).evaluate(LocationDoc));

        //read an xml node using xpath
       return location;

    }
    
}
