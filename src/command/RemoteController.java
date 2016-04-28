package command;

public class RemoteController {
  Command[] onCommands;
  Command[] offCommands;
  
  public RemoteController(){
	  onCommands = new Command[7];
	  offCommands = new Command[7];
	  noCommand ncommand= new noCommand();
	  for(int i=0; i<7;i++){
		  onCommands[i]  =ncommand;
		  offCommands[i] =ncommand; 
	  }
  }
	
  public void setCommand(int slot, Command onCommand, Command offCommand){
	  onCommands[slot]  = onCommand;
	  offCommands[slot] = offCommand;
  }
  
 
  public void onButtonWasPushed(int slot){
	  onCommands[slot].execute();
  }
  
  public void offButtonWasPushed(int slot){
	  offCommands[slot].execute();
  }
  
  public String toString(){
	StringBuffer stringBuff = new StringBuffer();
	stringBuff.append("\n----Remote Control---------\n");
    for(int i=0; i<onCommands.length;i++){
    	stringBuff.append("[Slot"+ i+ " ]"  + onCommands[i].getClass().getName() + " "
    			+ "  " + offCommands[i].getClass().getName() + " \n");
    }
	
	return stringBuff.toString();
	
  
  }



}
