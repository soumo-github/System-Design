
public class TurnOn implements Command{

	AC ac;
	TurnOn(AC ac){
		
		this.ac = ac;
		
	}
	
	@Override
	public void execute() {

		ac.turnon();
		
	}
	
	@Override
	public void undo() {
		ac.turnoff();
	}

}
