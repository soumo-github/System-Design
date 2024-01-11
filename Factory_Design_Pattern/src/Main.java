
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant beef = new BeefBurgerFactory();
		beef.OrderBurger();

		System.out.println("-------------------------------");
		System.out.println("-------------------------------");
		
		Restaurant veg = new VegBurgerFactory();
		veg.OrderBurger();
	}

}
