/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaxmlproject;


/**
 *
 * @author 70060462
 */
public class Location {
    private float latitude;
    private float longitude;

    @Override
    public String toString() {
        return "Location{" + "latitude=" + latitude + ", longitude=" + longitude + ", name=" + name + ", extendedName=" + extendedName + '}';
    }
    private String name;
    private String extendedName;

    public Location() {
    }

    public Location(float latitude, float longitude, String name, String extendedName, String region) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.extendedName = extendedName;
    }

    public String getExtendedName() {
        return extendedName;
    }

    public void setExtendedName(String extendedName) {
        this.extendedName = extendedName;
    }

   
    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
