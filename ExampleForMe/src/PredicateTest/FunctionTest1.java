package PredicateTest;

import java.util.function.Function;

public class FunctionTest1 {

	public static void main(String[] args) {
		Function<String, Integer> f1 = (txt) -> {
			return txt.length();
		};
		System.out.println(f1.apply("동해물과 백두산이 마르고 닳도록"));

		Function<Integer, String> f2 = num -> {
			return num > 0 ? "양수" : "음수";
		};
		System.out.println(f2.apply(7));
		System.out.println(f2.apply(-1));

		Function<Mouse, Integer> f3 = mouse -> (int) (mouse.getPrice() * 1.1);
		System.out.println(f3.apply(new Mouse("TTT-5455", 1250)));
	}

}
