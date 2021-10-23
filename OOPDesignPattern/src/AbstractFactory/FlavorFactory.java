package AbstractFactory;



public class FlavorFactory implements AbstaractFactory {

	public Flavor Addflavor(String flavor) {

		if (flavor.equalsIgnoreCase("deviled"))
			return new DeviledChicken();

		if (flavor.equalsIgnoreCase("masala"))
			return new MasalaChicken();

		if (flavor.equalsIgnoreCase("Thanduri"))
			return new ThanduriChicken();

		else
			return null;

	}

	@Override
	public OrderType setOrder(String type) {
		// TODO Auto-generated method stub
		return null;
	}


}
