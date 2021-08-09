package ArrayTest;

public class EnhancedFor {

	public static void main(String[] args) {
		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] += 10; // 각 배열 요소에 10을 더함.
		}

		for (int e : arr2) {
			e += 10; // 각 배열 요소에 10을 더함.
		}
		// arr1의 모든 배열 요소 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// arr2의 모든 배열 요소 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
