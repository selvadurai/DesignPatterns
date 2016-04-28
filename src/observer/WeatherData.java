package observer;

import java.util.ArrayList;

public class WeatherData  implements Subject{
   private ArrayList<Observer> observers;
   private float temperature;
   private float humidity;
   private float pressure;
   
   public WeatherData(){
	   observers = new ArrayList<Observer>();
 
   }
   
   public void registarObserver(Observer o){
	   observers.add(o);
   }
   
   public void removeObserver(Observer o){
	   int i=observers.indexOf(o);
   }
   
   public void notifyObserver(){
	   for(Observer observer: observers){
		   observer.update(temperature,humidity,pressure);
	   }
   }
	
   public void measurementsChanged(){
	   notifyObserver();
   }
	
   public void setMeasurments(float temperature,float humidity,float pressure){
	   this.temperature=temperature;
	   this.humidity   =humidity;
	   this.pressure   =pressure;
   }



}