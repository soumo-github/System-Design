
public class AC {

	boolean ison;
	int temp;

	public void turnon() {
		ison = true;
		System.out.println("AC is on");
	}
	
	public void turnoff() {
		ison = false;
		System.out.println("AC is off");
	}

	public void setTemp(int temp) {
		this.temp = temp;
		System.out.println("Temp chamged to " + temp);
	}
}
