//singleton multithreading

package Singleton;

public class Login {

	private static Login lg = null;

	private Login() {
	};

	public static Login createLogin() {
		if (lg == null) {
			synchronized (Login.class) {
				if (lg == null) {
					lg = new Login();
				}
			}
		}
		return lg;
	}
}
