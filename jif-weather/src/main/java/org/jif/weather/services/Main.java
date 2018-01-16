package org.jif.weather.services;

import java.io.InputStream;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Main {

    private String zip;
    private static Logger log = Logger.getLogger(YahooParser.class);

    public static void main(String[] args) throws Exception {

        // Configure Log4j
        PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log4j.properties"));

        // Read the zip code from the command line, if not use default
        String zipcode = "95662";
        try{
            zipcode = args[0];
        }catch (Exception e){}

        // Start the main program
        new Main(zipcode).start();
    }

    /**
     * Class Constructor
     * @param zip
     */
    public Main(String zip){
        this.zip = zip;
    }


    public void start() throws Exception {
        // Retrieve Data
        InputStream dataIn = new YahooRetriever().retrieve(zip);


        // Parse Data
        Weather weather = new YahooParser().parse(dataIn);

        // Format (Print) Data
        System.out.print( new WeatherFormatter().format(weather) );
    }
}
