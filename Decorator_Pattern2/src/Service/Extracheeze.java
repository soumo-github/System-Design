package Service;

import Model.BasePizza;

public class Extracheeze extends ToppingDecorator{
	
	BasePizza bp;
	
	public Extracheeze(BasePizza pizza) {
		this.bp = pizza;
	}
	
	@Override
	public int cost() {
		
		return this.bp.cost() + 100;
		
	}

}
