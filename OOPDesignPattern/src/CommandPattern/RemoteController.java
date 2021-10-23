package CommandPattern;
//remote class implemented

public class RemoteController {
	Command onc;
	Command offc;
	
	public void setCommand(Command onc,Command offc) {
		this.offc=offc;
		this.onc=onc;
	}
	
	public void onButtonPushed()
	{
		onc.execute();
		
	}
	
	
	public void OffButtonPushed()
	{
		offc.execute();
		
	}
}
