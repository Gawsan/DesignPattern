package StategyPattern;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car t=new car();
		CarBehaviour carBehaviour =new SoundProof();
		t.setCarbehaviour(carBehaviour);
		t.fireEngine();
		
	}

}
