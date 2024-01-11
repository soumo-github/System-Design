
public class Main {

	public static void main(String[] args) {
		
		LogProcessor obj = new InfoLogProcessor(new DebugLogProccessor(new ErrorLogProcessor(null)));

		obj.log(LogProcessor.ERROR, " Exception");
//		obj.log(LogProcessor.DEBUG, "Debugging required");
//		obj.log(LogProcessor.INFO, "Just for Info");
//		
	}

}
