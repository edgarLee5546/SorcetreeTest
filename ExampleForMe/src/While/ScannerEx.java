package While;

import java.util.Scanner;

public class ScannerEx {

	private static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int input1 = sc.nextInt();

		System.out.println("두번째 숫자를 입력해주세요");
		int input2 = sc.nextInt();

		// input 1 < input2일때
		if (input1 < input2) {
			for (int num = input1; num < (input2 + 1); num++) {
				sum += num;
			}
		} else if (input1 == input2) {
		} else {
			for (int num = input2; num < (input1 + 1); num++) {
				sum += num;
			}
		}
		System.out.println("두 숫자 사이의 합은 " + sum + "입니다.");
	}
}