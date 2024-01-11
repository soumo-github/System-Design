
public class ErrorLogProcessor extends LogProcessor{

	public ErrorLogProcessor(LogProcessor nextProcessor) {
		
		super(nextProcessor);
		
	}
	
	@Override
	public void log(int loglevel, String msg) {
		if(loglevel == ERROR) {
			System.out.println("ERROR" + msg);
		}
		else {
			super.log(loglevel, msg);
		}
	}

}
