package command;

public class noCommand implements Command {
	Light light;
	
	
	@Override
	public void execute() {
	 light.off();	
		
	}

	@Override
	public void undo() {
	 light.off();
	}

}
