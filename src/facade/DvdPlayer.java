package facade;

public class DvdPlayer implements Command,PlayerCommand {

	@Override
	public String eject() {
		return "DVD ejected";
	}

	@Override
	public String stop() {
		return "DVD Stopped";
	}

	@Override
	public String pause() {
		return "DVD pause";
	}

	@Override
	public String on() {
		return "DVD Player On";
	}
	
	public String play(String name){
		return name + "  "+ " is  playing";
	}

	@Override
	public String off() {
		return "DVD Player off";
	}

}
