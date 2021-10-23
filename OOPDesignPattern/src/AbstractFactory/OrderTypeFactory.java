/**
 * 
 */
package AbstractFactory;



/**
 * @author gawsa
 *
 */
public class OrderTypeFactory implements AbstaractFactory {
	public OrderType setOrder(String type) {
		if (type.equalsIgnoreCase("dinein"))
			return new DineIN();
		if (type.equalsIgnoreCase("child"))
			return new ChildPlay();
		if (type.equalsIgnoreCase("takeaway"))
			return new TakeAway();
		else
			return null;

	}

	@Override
	public Flavor Addflavor(String flavor) {
		// TODO Auto-generated method stub
		return null;
	}


}
