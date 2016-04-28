package command;

public class Light {
    
	int lightStatus;
	String enviroment;
	
	public Light(){
		
	}
	
	public Light(String enviroment){
	  this.enviroment=enviroment;	
	}
	
	public int off(){
	   lightStatus=0;
	   System.out.println("Light is Off");
	   return lightStatus;
	}
	
	public int on(){
		lightStatus=1;
		System.out.println("Light is on");
		return lightStatus;
	}
 
   
}
