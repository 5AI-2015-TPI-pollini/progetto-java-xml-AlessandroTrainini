/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaxmlproject;

/**
 *
 * @author AlexUSER
 */
public class Data {
    private Weather weather;
    private Location location;

    public Data(Weather weather, Location location) {
        this.weather = weather;
        this.location = location;
    }

    public Data() {
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
