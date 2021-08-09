package While;

public class StringCut {
	public static void main(String[] args) {
		char[] arr = new char[26];
		int j = 65;
		for (int i = 1; i < 27; i++) {
			arr[i - 1] = (char) j;
			System.out.print(arr[i - 1]);
			j++;
			if (i % 10 == 0)
				System.out.println("");
		}

	}
}