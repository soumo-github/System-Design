package Main;

import Model.BasePizza;
import Model.Chicken;
import Model.Farmhouse;
import Service.ExtraMushroom;
import Service.Extracheeze;

public class Main {

	public static void main(String[] args) {
		
		BasePizza bp = new ExtraMushroom(new Extracheeze(new Farmhouse()));
		
		System.out.println(bp.cost());

	}

}
