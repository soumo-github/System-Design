package Service;

import Model.BasePizza;

public class ExtraOnion extends ToppingDecorator {
	
	BasePizza bp;
	
	public ExtraOnion(BasePizza pizza) {
		this.bp = pizza;
	}
	
	@Override
	public int cost() {
		
		return this.bp.cost() + 50;
		
	}
}
