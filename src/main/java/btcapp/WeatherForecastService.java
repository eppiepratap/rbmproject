package btcapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherForecastService {
	
	@RequestMapping("/getforecast")
	public List<DayTemperature> getForecast(@RequestParam(value="zipcode")int zipCode)	{
				
		System.out.println("Zip Code: " + zipCode); 
		List<DayTemperature> forecastList = prepareDummyData();
		return forecastList;
	}
	
	private ArrayList<DayTemperature> prepareDummyData() {
		
		ArrayList<DayTemperature> forecastList = new ArrayList<DayTemperature>();
		
		DayTemperature dayOne = new DayTemperature();
		dayOne.setRemarks("Monday");
		dayOne.setMinTemperature(2);
		dayOne.setMaxTemperature(10);
		
		DayTemperature dayTwo = new DayTemperature();
		dayTwo.setRemarks("Tuesday");
		dayTwo.setMinTemperature(3);
		dayTwo.setMaxTemperature(12);
		
		DayTemperature dayThree = new DayTemperature();
		dayThree.setRemarks("Wednesday");
		dayThree.setMinTemperature(7);
		dayThree.setMaxTemperature(15);
		
		forecastList.add(dayOne);
		forecastList.add(dayTwo);
		forecastList.add(dayThree);
		
		return forecastList;
	}
}
