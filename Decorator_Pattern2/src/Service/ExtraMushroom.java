package Service;

import Model.BasePizza;

public class ExtraMushroom extends ToppingDecorator {

	BasePizza bp;
	
	public ExtraMushroom(BasePizza pizza) {
		this.bp = pizza;
	}
	
	@Override
	public int cost() {

		return this.bp.cost() + 150;
		
	}

}
