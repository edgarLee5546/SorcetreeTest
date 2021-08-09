package TriangelTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevserTriangle {

	static class Result {

		/*
		 * Complete the 'staircase' function below.
		 *
		 * The function accepts INTEGER n as parameter.
		 */

		public static void staircase(int n) {
			for (int row = 0; row < n; row++) {
				for (int col = 0; col < n; col++) {
					if (n - 1 - col > row)
						System.out.print(" ");
					else
						System.out.print("#");
				}
				System.out.println();
			}
		}
	}

	public static class Solution {
		public static void main(String[] args) throws IOException {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			int n = Integer.parseInt(bufferedReader.readLine().trim());

			Result.staircase(n);

			bufferedReader.close();
		}
	}
}