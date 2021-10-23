package CommandPattern;

public class CmdTest {

	public static void main(String[] args) {
		RemoteController rm = new RemoteController();
		Light l = new Room();
		Command on = new OnCommand(l);
		Command Off = new OffCommand(l);
		rm.setCommand(on, Off);
		rm.OffButtonPushed();
		rm.onButtonPushed();
	}
}
