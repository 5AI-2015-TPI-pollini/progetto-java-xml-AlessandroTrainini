/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaxmlproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    
    Document WeatherDoc;
    Document LocationDoc; 
    
    private DocumentBuilder builder;

    public DataFiller(){
        try {
            
            
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            builder = builderFactory.newDocumentBuilder();
            
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DataFiller.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    public Location getLocationData()
    {
        Location location=new Location();
        try {
            
            LocationDoc =  builder.parse(new FileInputStream("location.xml"));
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
            
        } catch (Exception ex) {
            Logger.getLogger(DataFiller.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(location);
        return location;
    }
    
    public Weather getWeatherData()
    {
        Weather weather=new Weather();
        try{
            WeatherDoc = builder.parse(new FileInputStream("weather.xml"));
            
            String Weather = "/current/clouds/@name";
            String Temperature = "/current/temperature/@value"; 
            String Humidity = "/current/humidity/@value"; 
            String Pressure = "/current/pressure/@value"; 
            
            XPath xPath =  XPathFactory.newInstance().newXPath();
            
            weather.setDescription(xPath.compile(Weather).evaluate(WeatherDoc));
            weather.setTemperature(Float.parseFloat(xPath.compile(Temperature).evaluate(WeatherDoc)));
            weather.setUmidithy(Float.parseFloat(xPath.compile(Humidity).evaluate(WeatherDoc)));
            weather.setPressure(Float.parseFloat(xPath.compile(Pressure).evaluate(WeatherDoc)));

        }
        catch(Exception ex)
        {
            
        }
        System.out.println(weather);
        return weather;
    }
    
}
