package TriangelTest;

public class Pyramid {

	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
			for (int k = 1; k <= 5; k++) {
				for (int n = 1; n <= 5 - k; n++) {
					System.out.print(" ");
				}
					for (int o = 1; o <= k*2-1; o++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
