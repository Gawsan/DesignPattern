package CommandPattern;

public class Room implements Light {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println(" -- Room light turned on --");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
		System.out.println("....Room light turned off...");
		
	}

}
