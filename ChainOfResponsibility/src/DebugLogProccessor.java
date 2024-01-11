
public class DebugLogProccessor extends LogProcessor{

	public DebugLogProccessor(LogProcessor nextProcessor) {
		super(nextProcessor);
	}
	
	public void log(int loglevel, String msg) {
		if(loglevel == DEBUG) {
			System.out.println("DEBUG" + msg);
		}
		else {
			super.log(loglevel, msg);
		}
	}
}
