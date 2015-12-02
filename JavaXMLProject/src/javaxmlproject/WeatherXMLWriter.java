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
 * @author Alessandro
 */
public class WeatherXMLWriter {
    private URL WeatherURL;

    public WeatherXMLWriter(URL WeatherURL) {
        this.WeatherURL = WeatherURL;
    }

    public URL getWeatherURL() {
        return WeatherURL;
    }

    public void setWeatherURL(URL WeatherURL) {
        this.WeatherURL = WeatherURL;
    }
    public void generateXML() throws IOException
    {
            URLConnection con = WeatherURL.openConnection();
        
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

// Read it ...
            String inputLine;
            PrintWriter writer=new PrintWriter(new FileWriter("weather.xml"));
            while ((inputLine = in.readLine()) != null)
                writer.println(inputLine);
            writer.close();
            in.close();
            System.out.println("finito");
    }
}
