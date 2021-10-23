package BridgePattern;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		key x3=new BmwCar();
		key a8=new AudiCar();
		
		new KeyImplement(a8).on();
		new KeyImplement(x3).on();

	}

}
