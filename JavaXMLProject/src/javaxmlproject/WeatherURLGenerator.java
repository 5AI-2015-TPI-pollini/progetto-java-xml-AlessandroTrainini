/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaxmlproject;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author 70060462
 */
public class WeatherURLGenerator {
    private String URL_PREFIX = "http://api.openweathermap.org/data/2.5/weather?";
    private String LATITUDE_PREFIX = "lat=";
    private String LONGITUDE_PREFIX = "&lon=";
    private String METRIC_UNITS = "&units=metric";
    private String APP_ID ="&appid=22dcdfabeddca62340b435b02bd2bb08";
    private String XML_MODE = "&mode=xml";
    
    private Location location;
    private URL URL;
    
    
    public WeatherURLGenerator(Location location)
    {
        this.location=location;
    }
   
    public URL generateURL() throws MalformedURLException {
        //create URL String
        StringBuilder URLBuilder = new StringBuilder(URL_PREFIX);
        URLBuilder.append(LATITUDE_PREFIX);
        URLBuilder.append(location.getLatitude());
        URLBuilder.append(LONGITUDE_PREFIX);
        URLBuilder.append(location.getLongitude());
        URLBuilder.append(METRIC_UNITS);
        URLBuilder.append(APP_ID);
        URLBuilder.append(XML_MODE);
        
        return new URL(URLBuilder.toString());
    }
}
