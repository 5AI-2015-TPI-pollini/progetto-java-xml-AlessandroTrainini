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
public class LocationURLGenerator {
    private String nameOfLocation;
    private String LocationURL="https://maps.googleapis.com/maps/api/geocode/xml?address=";

    public LocationURLGenerator(String nameOfLocation) {
        this.nameOfLocation = nameOfLocation;
    }

    public String getLocationURL() {
        return LocationURL;
    }

    public void setLocationURL(String LocationURL) {
        this.LocationURL = LocationURL;
    }
    
    public URL getURL() throws MalformedURLException
    {
        return new URL ( LocationURL + nameOfLocation );
    }
}
