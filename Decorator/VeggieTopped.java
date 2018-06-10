package decorator;

public class VeggieTopped extends PizzaDecorator {

	public VeggieTopped(Pizza pObject) {
		pizzaObject = pObject;
	}
	
	@Override 
	public String getDescription() {
		return ("Veggie topped " + pizzaObject.getDescription());
	}
	
	@Override
	public int getCost() {
		return (60 + pizzaObject.getCost());
	}
}
