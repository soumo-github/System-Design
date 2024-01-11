package Main;

import Model.Charger;
//import Model.IphoneChargeer;
import Model.Phone;
import Service.ChargerAdapter;

public class Main {

	public static void main(String[] args) {

		Charger ch = new ChargerAdapter();
//		IphoneChargeer iph = new IphoneChargeer();
		Phone p = new Phone();
		p.setCh(ch);
		p.chargePhone(5.5);
	}

}
