package facade;

public class PopcornPopper implements Command {

	@Override
	public String on() {
		return "Popcorn popper On";
	}
	
	public String pop(){
		return "Make popcorn";
	}

	@Override
	public String off() {
		return "Popcorn popper Off";
	}
     



}
