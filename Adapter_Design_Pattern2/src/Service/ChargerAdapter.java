package Service;

import Model.Charger;
import Model.IphoneChargeer;

public class ChargerAdapter implements Charger {

	
	IphoneChargeer iph = new IphoneChargeer();
	@Override
	public void charge(double amp) {
		iph.icharge(amp);
		
	}

}
