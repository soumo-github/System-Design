
public class Main {

	public static void main(String[] args) {
		
		CareTaker ct = new CareTaker();
		Originator org = new Originator("Soumalya Dhar", 24, "soumo2k15@gmail.com");
		Memento snap1 = org.create();
		ct.add(snap1);
		org.setAge(23);
		org.setMail("soumalya.dhar@cognizant.com");
		
		Memento snap2 = org.create();
		ct.add(snap2);
		
		
		
	}

}
