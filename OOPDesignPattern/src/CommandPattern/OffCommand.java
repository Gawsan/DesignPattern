package CommandPattern;

public class OffCommand implements Command {
	
	
	
	private Light light;


	public  OffCommand(Light light) {
		// TODO Auto-generated method stub

		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();

	}

	
}
