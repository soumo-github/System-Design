
public class InfoLogProcessor extends LogProcessor{

	public InfoLogProcessor(LogProcessor nextProcessor) {
		super(nextProcessor);
	}
	
	public void log(int loglevel, String msg) {
		if(loglevel == INFO) {
			System.out.println("INFO" + msg);
		}
		else {
			super.log(loglevel, msg);
		}
	}
}
