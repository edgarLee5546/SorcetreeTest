package ArrayTest;

import java.util.Arrays;

/**
 * sort() 메소드는 전달받은 배열의 모든 요소를 오름차순으로 정렬
 * @author edgar
 */
public class sort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 1, 2, 10, 7, 9, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
