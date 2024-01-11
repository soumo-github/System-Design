
public abstract class PizzaMaker {

	public abstract void selectBread();

	public abstract void Ingredients();

	public abstract void bakeAtTemp();

	public abstract void addToppings();

	public abstract void addCheese();

	public  void make() {
		
		selectBread();
		Ingredients();
		addToppings();
		addCheese();
		bakeAtTemp();
		
	}
}
