package AbstractFactory;

public class Clientsystem {

	public static void main(String[] args) {
		FactoryProducer fp = new FactoryProducer();
		AbstaractFactory flavor = fp.Createpizza("flavor");
		Flavor choise = flavor.Addflavor("masala");
		choise.AddingFlavor();

		AbstaractFactory order = fp.Createpizza("order");
		OrderType type = order.setOrder("child");
		type.orderSucess();

	}
}
