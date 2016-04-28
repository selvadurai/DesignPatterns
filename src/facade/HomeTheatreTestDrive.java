package facade;

public class HomeTheatreTestDrive {

	public static void main(String[] args) {
		Amplifier     amp       = new Amplifier();
		CdPlayer      cd        = new CdPlayer();
		DvdPlayer     dvd       = new DvdPlayer();
		Screen        screen    = new Screen();
		Turner        tuner     = new Turner();
		Projector     projector = new Projector();
		TheatreLights lights    = new TheatreLights();
		PopcornPopper popper    = new PopcornPopper();
		
		HomeTheatreFacade homeTheatre 
		    = new HomeTheatreFacade( amp, tuner, dvd,cd, projector, lights,screen, popper);
		
		homeTheatre.watchMovie("Scarface");
		homeTheatre.endMovie();

	}

}
