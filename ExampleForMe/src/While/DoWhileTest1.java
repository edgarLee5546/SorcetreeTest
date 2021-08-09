package While;

import java.util.Scanner;

public class DoWhileTest1 {
	public static void main(String[] args) {
		int num = 6;
//		Scanner sc = new Scanner(System.in);
		do {
//			num = sc.nextInt();
//			System.out.println("입력 값: " + num);
			System.out.println(num);
			num++;
		} while (num <= 5);
		System.out.println("program and.... ");
	}
}