package singleton;

public class Singleton {

	private static Singleton uniqueInstance;
	private String message;
	
	private Singleton(){
		message="hello mr gump";
	}
	
	
	public static synchronized Singleton getInstance(){
		if(uniqueInstance ==null){
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public String getMessage(){
		return message;
	}
	
	public void setMessage(String message){
		this.message=message;
	}



}
