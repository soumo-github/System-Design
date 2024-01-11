
public class TurnOff implements Command{
	
	AC ac;
	TurnOff(AC ac){
		
		this.ac = ac;
		
	}
	
	@Override
	public void execute() {

		ac.turnoff();
		
	}

	@Override
	public void undo() {
		ac.turnon();
	}
}
