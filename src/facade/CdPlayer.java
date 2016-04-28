package facade;

public class CdPlayer implements Command,PlayerCommand{

	@Override
	public String eject() {
		return "Cd player ejected";
	}

	@Override
	public String stop() {
		return "Cd Player stoped";
	}

	@Override
	public String pause() {
		return "Cd Player pause";
	}

	@Override
	public String on() {
		return "CD Player on";
	}

	@Override
	public String off() {
		return "CD Player stopped";
	}

}
