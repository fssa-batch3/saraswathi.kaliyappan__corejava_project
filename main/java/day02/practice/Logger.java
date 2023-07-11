package day02.practice;

public class Logger {
	
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void log (String msg) {
		// TODO complete this code using the above template
		System.out.println("LOG: " + msg);

	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);

	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);

	}
	public static void log (int num) {
		// TODO Complete this code
		System.out.println("LOG: " + num);

	}
	public static void error (int num) {
		// TODO Complete this code
		System.out.println("ERROR: " + num);

	}
	
	public static void main(String[] args) {
		
		Logger loger = new Logger();
		
		loger.debug("Hello");
		loger.log("Hello");
		loger.error("Hello");

		loger.debug(25);
		loger.log(81);
		loger.error(9);

		
	}
	
	// Similarly write overloaded methods for error and info.
}