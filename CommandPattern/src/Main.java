
public class Main {

	public static void main(String[] args) {
		
		AC ac = new AC();
		
		Remote rm = new Remote();
		
		rm.setcommand(new TurnOn(ac));
//		rm.setcommand(new set);
		rm.pressButton();
		rm.undo();
		
	}

}