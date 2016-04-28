package observer;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay =
				new CurrentConditionDisplay(weatherData);
	
		currentDisplay.update(85f, 21f,10f);
		currentDisplay.update(54f,32f,32);
	}

}
