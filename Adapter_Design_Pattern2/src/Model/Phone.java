package Model;

public class Phone {
	
	private Charger ch;
	
	public Charger getCh() {
		return ch;
	}

	public void setCh(Charger ch) {
		this.ch = ch;
	}
	
	public void chargePhone(double amp) {
		
		ch.charge(amp);
		
	}
}
