package ArrayTest;

public class TwoDArrayPrac {

	private static int rating;

	public static void main(String[] args) {
		int sum = 0;
		rating = 25;
		for (int col = 0; col <= 3; col++) {
			sum += rating;
		}
		double average = (double) sum / 4;
		System.out.println(average);
	}

}
