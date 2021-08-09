package ArrayTesttest;

import java.util.logging.Logger;

import com.chlee.module.CHLogger;

public class TestArrayTest {
	private static Logger logger = CHLogger.getLogger();

	public static void main(String[] args) {
		String[] names = { "A", "B", "C", "D", null };
		for (String name : names) {
//			assert name != null;
			if(name != null) 
			logger.config("" + name.length());
		}
	}

}
