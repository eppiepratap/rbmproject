package btcapp;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BTCApp {

	public static void main(String[] args) {
		
		WeatherForecastService wfc = new WeatherForecastService();
		List<DayTemperature> forecast = wfc.getForecast(69234);
		
		for(DayTemperature temperature: forecast)	{
			
			System.out.println("Day: " + temperature.getRemarks());
			System.out.println("Min: " + temperature.getMinTemperature());
			System.out.println("Max: " + temperature.getMaxTemperature());
			System.out.println("---------------------------------------");
		}
		
		
		SpringApplication.run(BTCApp.class, args);
	}
}
