import java.util.Stack;

public class Remote {

	Stack<Command> cmdHist = new Stack<>();
	Command cmd;
	Remote(){}
	
	public void setcommand(Command cmd) {
		this.cmd= cmd;
	}
	
	public void pressButton() {
		cmd.execute();
		cmdHist.add(cmd);
	}
	
	public void undo() {
		if(!cmdHist.isEmpty()) {
			Command lc = cmdHist.pop();
			lc.undo();
		}
	}
}
