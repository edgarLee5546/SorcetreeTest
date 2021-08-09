package While;

import java.util.Scanner;

public class CalculatorMake {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("첫번째 숫자를 입력하세요");
			int firNum = sc.nextInt();
			System.out.println("사칙연산을 입력하세요");
			String buho = sc.next();
			System.out.println("두번째 숫자를 입력하세요");
			int secNum = sc.nextInt();

			if ("+".equals(buho)) {
				System.out.println(firNum + secNum);
			} else if ("-".equals(buho)) {
				System.out.println(firNum - secNum);
			} else if ("*".equals(buho)) {
				System.out.println(firNum * secNum);
			} else if ("/".equals(buho)) {
				System.out.println((int) ((float) firNum / secNum * 100 + 0.5) / 100f);
			} else {
				System.out.println("사칙연산 아님. 종료.");
				break;
			}
		} while (true);
	}
}
