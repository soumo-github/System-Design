
public abstract class LogProcessor {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	
	LogProcessor nextProcessor;

	
	public LogProcessor(LogProcessor nextProcessor) {
		
		this.nextProcessor = nextProcessor;
		
	}
	
	public void log(int loglevel, String msg) {
		if(nextProcessor != null) {
			nextProcessor.log(loglevel, msg);
		}
	}
	
	
}
