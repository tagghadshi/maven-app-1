package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//priority increase left to right
//Log Levels : T-trace , D-debug ,I- info, W-warn , E-error , F- fatal
public class LoggingDemo {
	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		logger.fatal("Fatal message");//StackOverFlow
		logger.error("exception message");
		logger.warn("warning message");
		logger.info("info message");
		logger.debug("This is debug message");
		logger.trace("trace message");
		
	}
}
