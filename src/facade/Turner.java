package facade;

public class Turner implements Command{
    
	static int am=0;
    static int freq=0;	
	@Override
	public String on() {
		return "Turner on";
	}

	@Override
	public String off() {
		return "Turner off";
	}
	
	
	public String setAm(){
		am++;
	   return "Chanel is "+ am;
	}
	
	public String setFrequency(){
		freq++;
		return "Frequency is "+ freq;
	}


}
