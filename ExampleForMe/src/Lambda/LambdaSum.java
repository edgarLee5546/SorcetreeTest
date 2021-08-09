package Lambda;

interface Compare {
	public int comapareTo(int a, int b);
}

public class LambdaSum {

	public static void exec(Compare com) {
		int k = 10;
		int m = 20;
		int value = com.comapareTo(k, m);
		System.out.println(value);
	}

	public static void main(String[] args) {
		exec((a, b) -> a + b);
	}

}
