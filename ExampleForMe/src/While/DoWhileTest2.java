package While;

public class DoWhileTest2 {

	public static void main(String[] args) {
		char a = 'a'; // char로 타입설정 초기화
		do {
			System.out.print(a + " "); // a부터 가로로 쭉 나열시켜 출력함
			a++; // 1씩 증가시키면서 프로그램실행
		} while (a <= 'z'); // 증가되는 값이 z가 될때까지 실행
		System.out.println();

//		int i;
//		for (int i = 1; i < 5; i += 2) {
//			do {
//				System.out.print(i + " ");
//				i++;
//			} while (i <= 10);
//		}
	}
}
