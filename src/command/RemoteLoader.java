package command;

public class RemoteLoader {

	public static void main(String[] args) {
        RemoteController remoteControl = new RemoteController();
        Light  livingRoomLight = new Light("Living Room");
        LightOnCommand   livingRoomLightOn   =new LightOnCommand(livingRoomLight);
        LightOffCommand  livingRoomLightOff  =new LightOffCommand(livingRoomLight);
        
        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        //System.out.println(remoteControl);
        remoteControl. onButtonWasPushed(0);
        remoteControl. offButtonWasPushed(0);
        System.out.println(remoteControl);
	}

}
