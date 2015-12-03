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
public class LocationXMLWriter {
    private URL LocationURL;

    public LocationXMLWriter(URL LocationURL) {
        this.LocationURL = LocationURL;
    }


    public URL getLocationURL() {
        return LocationURL;
    }

    public void setLocationURL(URL LocationURL) {
        this.LocationURL = LocationURL;
    }
    public void generateXML() throws IOException
    {
            URLConnection con = LocationURL.openConnection();
            System.out.println(LocationURL);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));

// Read it ...
            String inputLine;
            PrintWriter writer=new PrintWriter(new FileWriter("location.xml"));
            while ((inputLine = in.readLine()) != null)
                writer.println(inputLine);
            writer.close();
            in.close();
    }
}
