package Singleton;

public class LoginTest {

	public static void main(String[] args) {
		Login ob=Login.createLogin();
		SimpleSingleton st=SimpleSingleton.getInstances();
	}
}
