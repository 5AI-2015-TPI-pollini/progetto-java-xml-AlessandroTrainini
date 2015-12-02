/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaxmlproject;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Alessandro Trainini
 * 
 */
public class XMLWriter {
    private URL WeatherURL;
    private URL LocationURL;

    public XMLWriter(URL WeatherURL, URL LocationURL) {
        this.WeatherURL = WeatherURL;
        this.LocationURL = LocationURL;
    }

    public URL getWeatherURL() {
        return WeatherURL;
    }

    public void setWeatherURL(URL WeatherURL) {
        this.WeatherURL = WeatherURL;
    }

    public URL getLocationURL() {
        return LocationURL;
    }

    public void setLocationURL(URL LocationURL) {
        this.LocationURL = LocationURL;
    }
    public void writeXML() throws IOException
    {
            URLConnection con = WeatherURL.openConnection();
         
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

// Read it ...
            String inputLine;
            PrintWriter writer=new PrintWriter(new FileWriter("weather.xml"));
            while ((inputLine = in.readLine()) != null)
                writer.println(inputLine);
            
            
            in.close();
    }
}
