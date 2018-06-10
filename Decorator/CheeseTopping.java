package decorator;

public class CheeseTopping extends PizzaDecorator {

	public CheeseTopping(Pizza pObject) {
		pizzaObject = pObject;
	}
	
	@Override 
	public String getDescription() {
		return ("Cheese topped " + pizzaObject.getDescription());
	}
	
	@Override
	public int getCost() {
		return (50 + pizzaObject.getCost());
	}
}
