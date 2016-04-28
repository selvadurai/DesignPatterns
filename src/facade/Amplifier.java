package facade;

public class Amplifier implements Command{
  private Turner     tuner;
  private DvdPlayer  dvdPlayer;
  private CdPlayer   cdPlayer;

  @Override
  public String on() {
	return "Amplifier On";
  }

   @Override
   public String off() {
	  return "Amplifier Off";
   }
   
   public void SetDvdPlayer(DvdPlayer dvdPlayer){
	   this.dvdPlayer=dvdPlayer;
   }
   
   public void SetCDPlayer(CdPlayer cdplayer){
	   this.cdPlayer=cdplayer;
   }
  
  
   public void setTuner(Turner tuner){
	   this.tuner=tuner;
   }
	
   public String setVolume(){
	   return "Volume increased";
   }	
	
}
