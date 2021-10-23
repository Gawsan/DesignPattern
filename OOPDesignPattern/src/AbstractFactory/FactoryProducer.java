package AbstractFactory;

public class FactoryProducer {
	public AbstaractFactory Createpizza(String msg) {
		if (msg.equalsIgnoreCase("flavor"))
			return new FlavorFactory();
		if (msg.equalsIgnoreCase("order"))
			return new OrderTypeFactory();
		else
			return null;
	}


}
