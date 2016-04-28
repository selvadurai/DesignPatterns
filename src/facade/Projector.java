package facade;

public class Projector implements Command {

	@Override
	public String on() {
		// TODO Auto-generated method stub
		return "Projector On";
	}

	@Override
	public String off() {
		// TODO Auto-generated method stub
		return "Projector Off";
	}

	public String tvMode(){
		return "Tv mode";	
	}
	
	public String wideScreenMode(){
		return "Widescreen Mode";
	}


}
