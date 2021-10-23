package StategyPattern;

public class car {
	CarBehaviour Carbehaviour;

	public void setCarbehaviour(CarBehaviour carbehaviour) {
		Carbehaviour = carbehaviour;
	}
	void fireEngine() {
		this.Carbehaviour.engineType();
	}
	

}
