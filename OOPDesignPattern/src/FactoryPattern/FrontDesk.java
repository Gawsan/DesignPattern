/**Factory Design Pattern
 * encapsulated the object creation by letting by letting 
 * subclasses to decide what objects to create
 */
package FactoryPattern;
import Pizza.*;


/**
 * @author gawsan
 *
 */
public class FrontDesk {
	
	
	public static void main(String [] args) {
	PizzaFactory officer=new PizzaFactory();
	Pizza pz=officer.createPizza("chicken");
	pz.DeliverPizza();
	
	}
	
}
