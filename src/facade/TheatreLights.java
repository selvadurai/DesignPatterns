package facade;

public class TheatreLights implements Command{

	@Override
	public String on() {
		return "Threater Lights On";
	}

	@Override
	public String off() {
		return "Threater Lights off";
	}

	public String dim(){
		return "Dim Lights";
	}
	
	
}
