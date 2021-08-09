package PredicateTest;

import java.util.function.Consumer;

public class InterFaceMerge {

	public static void main(String[] args) {
		Consumer<Mouse> c1 = m -> System.out.println(m.getName());

		Consumer<Mouse> c2 = m -> System.out.println(m.getPrice());

		Mouse m1 = new Mouse("TT-543 광마우스", 50000);
		c1.accept(m1);
		c2.accept(m1);
		System.out.println();

		Consumer<Mouse> c3 = c1.andThen(c2);
		c3.accept(m1);
		System.out.println();

		Consumer<Mouse> c4 = c2.andThen(c1);
		c4.accept(m1);
	}

}
