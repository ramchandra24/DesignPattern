package decorator;

public class MargharetaPizza extends Pizza {
	
	@Override
	public String getDescription() {
		return ("Marghareta " + super.getDescription());
	}
	
	@Override
	public int getCost() {
		return (super.getCost() + 100);
	}
}
