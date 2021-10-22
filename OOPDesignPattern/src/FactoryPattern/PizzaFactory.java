/**
 * 
 */
package FactoryPattern;

import Pizza.*;

/**
 * @author gawsan
 *
 */
public class PizzaFactory{ 
	
	public  Pizza createPizza(String pizza) {
		if(pizza.equalsIgnoreCase("veggie"))
			return new VegPizza();
		
		if(pizza.equalsIgnoreCase("chicken"))
			return new ChickenPizza();
		
		if(pizza.equalsIgnoreCase("chess"))
			return new CheesPizza();
		else
		return new OfferPizza();
	}
	
}
