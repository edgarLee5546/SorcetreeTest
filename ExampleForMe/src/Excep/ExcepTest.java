package Excep;

import java.util.logging.Logger;

import com.chlee.module.CHLogger;

public class ExcepTest {
	private static Logger logger = CHLogger.getLogger();

	public static void main(String[] args) {
		int i = 10;
		int j = 0;

		try {
			int k = i / 0;
			logger.config("K is " + k);
		} catch (ArithmeticException t) {
			t.printStackTrace();
			throw new ArithmeticException("평균 계산 오류 : " + j);
		}
	}
}
