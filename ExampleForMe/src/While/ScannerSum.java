package While;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Wirte the first number: ");
		int input1 = sc.nextInt();

		System.out.println("Wirte the second number: ");
		int input2 = sc.nextInt();

		int sum = input1 + input2;

		System.out.println("First number + " + "Second number = " + sum);
	}

}
