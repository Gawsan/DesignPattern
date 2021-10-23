package BridgePattern;

public class KeyImplement implements key {
	key k;
	
	
	public KeyImplement(key k) {
		this.k=k;
		
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		k.on();
		
		
	}

	@Override
	public void signal() {
		// TODO Auto-generated method stub
		k.signal();
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		k.brake();
		
	}

}
