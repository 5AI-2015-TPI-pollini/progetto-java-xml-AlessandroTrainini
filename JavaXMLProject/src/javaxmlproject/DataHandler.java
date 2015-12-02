/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaxmlproject;

import java.io.IOException;
import java.net.MalformedURLException;

/**
 *
 * @author Alessandro
 */
public class DataHandler {
    
    private LocationURLGenerator locationGenerator;
    private LocationXMLWriter locationWriter;
    
    private WeatherURLGenerator weatherGenerator;
    private WeatherXMLWriter weatherWriter;

    private DataFiller filler;
    
    private Location location;
    private Weather weather;
    public DataHandler(String location){
        locationGenerator = new LocationURLGenerator (location);
        filler=new DataFiller();
        
    }
    public void fillData() throws MalformedURLException, IOException
    {
        locationWriter=new LocationXMLWriter(locationGenerator.getURL());
        locationWriter.generateXML();
        location=filler.getLocationData();
        
        weatherGenerator=new WeatherURLGenerator (location);
        weatherWriter=new WeatherXMLWriter(weatherGenerator.getURL());
        weatherWriter.generateXML();
        weather=filler.getWeatherData();
    }
    
    
}
