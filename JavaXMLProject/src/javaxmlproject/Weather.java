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
public class Weather {
    private String description;
    private float temperature;
    private float wind;
    private float umidithy;

    public Weather(String description, float temperature, float wind, float umidithy) {
        this.description = description;
        this.temperature = temperature;
        this.wind = wind;
        this.umidithy = umidithy;
    }

    public Weather() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getWind() {
        return wind;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }

    public float getUmidithy() {
        return umidithy;
    }

    public void setUmidithy(float umidithy) {
        this.umidithy = umidithy;
    }
    
    
}
