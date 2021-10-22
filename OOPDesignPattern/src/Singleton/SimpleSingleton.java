package Singleton;

public class SimpleSingleton {
	private static SimpleSingleton singleton = null;

	private SimpleSingleton() {
	};

	public static SimpleSingleton getInstances() {

		if (singleton == null) {
			singleton = new SimpleSingleton();
		}
		return singleton;

	}

}
