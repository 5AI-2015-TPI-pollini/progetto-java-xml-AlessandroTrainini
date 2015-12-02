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
    private float pressure;
    private float umidithy;

    public Weather(String description, float temperature, float pressure, float umidithy) {
        this.description = description;
        this.temperature = temperature;
        this.pressure = pressure;
        this.umidithy = umidithy;
    }

    @Override
    public String toString() {
        return "Weather{" + "description=" + description + ", temperature=" + temperature + ", pressure=" + pressure + ", umidithy=" + umidithy + '}';
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

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float wind) {
        this.pressure = wind;
    }

    public float getUmidithy() {
        return umidithy;
    }

    public void setUmidithy(float umidithy) {
        this.umidithy = umidithy;
    }
    
    
}
