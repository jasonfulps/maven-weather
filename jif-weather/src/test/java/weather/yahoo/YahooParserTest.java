package weather.yahoo;

import java.io.InputStream;

import junit.framework.TestCase;


import org.jif.weather.services.Weather;
import org.jif.weather.services.YahooParser;

public class YahooParserTest extends TestCase {

    public YahooParserTest(String name) {
        super(name);
    }

    public void testParser() throws Exception {
        InputStream weatherData = getClass().getClassLoader().getResourceAsStream("weather.xml");
        Weather weather = new YahooParser().parse(weatherData);
        assertEquals("Orangevale", weather.getCity());
        assertEquals("CA", weather.getRegion());
        assertEquals("United States", weather.getCountry());
        assertEquals("51", weather.getTemp());
        assertEquals("Cloudy", weather.getCondition());
        assertEquals("50", weather.getChill());
        assertEquals("58", weather.getHumidity());
    }
}
