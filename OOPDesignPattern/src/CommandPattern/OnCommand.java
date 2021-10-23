package CommandPattern;

public class OnCommand implements Command {

	private Light light;




	public  OnCommand(Light light) {
		// TODO Auto-generated method stub

		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();

	}

}
