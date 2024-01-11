
public class VegBurgerFactory extends Restaurant{

	@Override
	protected Burger createBurger() {

		System.out.println("Creating Veg Burger");
		return new VegBurger();
	}

}
