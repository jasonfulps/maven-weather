package org.jif.weather.services;

import org.apache.log4j.Logger;

/**
 * Class Weather
 */
public class Weather {

    private String city;
    private String region;
    private String country;
    private String condition;
    private String temp;
    private String chill;
    private String humidity;
    private static Logger log = Logger.getLogger(WeatherFormatter.class);

    public Weather(){}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        log.debug("Set City: "+city);
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        log.debug("Set Region: "+region);
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        log.debug("Set Country: "+country);
        this.country = country;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        log.debug("Set Condition: "+condition);
        this.condition = condition;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        log.debug("Set Temp: "+temp);
        this.temp = temp;
    }

    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        log.debug("Set Chill: "+chill);
        this.chill = chill;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        log.debug("Set Humidity: "+humidity);
        this.humidity = humidity;
    }

}
