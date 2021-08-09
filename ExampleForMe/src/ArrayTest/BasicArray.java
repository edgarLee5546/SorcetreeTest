package ArrayTest;

import java.util.Arrays;

public class BasicArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5};
		int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
//		int[] arr2 = {3, 4}
		int arrayLength = arr1.length;
		System.out.println("The length of the array is : " + arrayLength);
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
//		int[] arr1 = { 1, 2, 3, 4, 5};
//		int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i] + " ");
//		}

		// private static int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//	public static void main(String[] args) {
//
//		int[] arr1 = Arrays.copyOfRange(arr, 2, 6);
//		System.out.print("arr의 요소중 인덱스 2에서 5까지 불러오기 : ");
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.print(arr1[i] + " ");
//		}
//		String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
//		for (int i = 0; i < weeks.length; i++)
//		System.out.print(weeks[i] + " ");
//		String[] weeks = new String[7];
//		weeks[0] = "Mon";
//		weeks[1] = "Tue";
//		weeks[2] = "Wed";
//		weeks[3] = "Thu";
//		weeks[4] = "Fri";
//		weeks[5] = "Sat";
//		weeks[6] = "Sun";
//
//		System.out.println(weeks[0]);
	}
}
