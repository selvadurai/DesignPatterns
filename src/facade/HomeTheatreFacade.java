package facade;

public class HomeTheatreFacade {
  
	 Amplifier     amp;
	 Turner        tuner;
	 DvdPlayer     dvd;
	 CdPlayer      cd;
	 Projector     projector;
	 TheatreLights lights;
	 Screen        screen;
	 PopcornPopper popper;
	
	 public HomeTheatreFacade( Amplifier amp, 
			                   Turner    tuner, 
			                   DvdPlayer dvd,
			                   CdPlayer  cd,
			                   Projector projector,
			                   TheatreLights lights,
			                   Screen screen, 
			                   PopcornPopper popper)
	 {
	    	 this.amp      = amp;
	    	 this.tuner    = tuner;
	    	 this.dvd      = dvd;
	    	 this.cd       = cd;
	    	 this.projector=projector;
	    	 this.lights   = lights;
		     this.popper   = popper;
		     this.screen   = screen;
	 }	
	
	
	
    public void watchMovie(String name){
    	System.out.println("Getting ready to watch a movie............");
    	popper.on();
    	popper.pop();
    	lights.dim();
    	screen.down();
    	projector.on();
    	projector.wideScreenMode();
    	amp.on();
    	amp.SetDvdPlayer(dvd);
    	amp.setVolume();
    	dvd.on();
    	dvd.play(name);
    }	

 
    public void endMovie(){
    	System.out.println("End of movie...............................");
    	popper.off();
    	lights.on();
    	screen.up();
    	projector.off();
    	amp.off();
    	dvd.stop();
    	dvd.eject();
    	dvd.off();
    	

    } 



}
