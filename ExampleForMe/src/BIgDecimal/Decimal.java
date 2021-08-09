package BIgDecimal;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.util.Scanner;


public class Decimal {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(Path.of("data/Decimal.txt"));
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				BigDecimal bj = new BigDecimal(s[j]);
				BigDecimal bjp1 = new BigDecimal(s[j + 1]);
				if (bj.compareTo(bjp1) < 0) { // swap
					s[n] = s[j];
					s[j] = s[j + 1];
					s[j + 1] = s[n];
				}
			}
		}

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}
}