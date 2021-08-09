package assignmentoperator;

public class assignmentoperatorTest {

	public static void main(String[] args) {
		int x = 10;

		int y = x-- + 5 + --x;

		System.out.println("x : " + x + ", y : " + y);

	}

}
