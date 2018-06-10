package decorator;

public class CheesePizza extends Pizza {
	
	@Override
	public String getDescription() {
		return ("Cheese" + super.getDescription());
	}
	
	@Override
	public int getCost() {
		return (super.getCost() + 150);
	}
}


