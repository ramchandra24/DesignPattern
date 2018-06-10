package decorator;

public class TestPizza {
	
	public static void main(String [] args) {
		Pizza pizzaObject = new CheeseTopping(new VeggieTopped(new MargharetaPizza()));

		System.out.println(pizzaObject.getDescription());
		System.out.println(pizzaObject.getCost());
	}
}

