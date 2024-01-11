public abstract class Restaurant {
	
	public void OrderBurger() {
		System.out.println("Ordering Burger");
		Burger burger = createBurger();
		burger.prepare();
	}
 
	protected abstract Burger createBurger();

	
	
	
}
