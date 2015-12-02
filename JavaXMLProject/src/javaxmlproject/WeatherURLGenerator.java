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
   
    public URL getURL() throws MalformedURLException {
        //create URL String
        String urlText=new String();
        urlText = URL_PREFIX;
        urlText += LATITUDE_PREFIX;
        urlText +=location.getLatitude();
        urlText +=LONGITUDE_PREFIX;
        urlText +=location.getLongitude();
        urlText +=METRIC_UNITS;
        urlText +=APP_ID;
        urlText +=XML_MODE;
        System.out.println(urlText);
        return new URL(urlText);
    }
}
