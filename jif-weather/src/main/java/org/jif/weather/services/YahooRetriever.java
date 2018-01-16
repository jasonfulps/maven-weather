package org.jif.weather.services;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.log4j.Logger;

public class YahooRetriever {

    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(String zipcode) throws Exception {
        log.info("Retrieving Weather Data");
//      String url = "http://weather.yahooapis.com/forecastrss?p=" + zipcode;   // OLD
        String url = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places%20where%20placetype%3D%27Zip%27%20AND%20text%3D%27" + zipcode + "%27%20)";
        log.info(url);
        URLConnection conn = new URL(url).openConnection();
        return conn.getInputStream();
    }
}
