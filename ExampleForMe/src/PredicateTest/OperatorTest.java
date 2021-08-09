package PredicateTest;

import java.util.function.BinaryOperator;

public class OperatorTest {

	public static void main(String[] args) {
		BinaryOperator<Integer> b1 = (n1, n2) -> n1 + n2;
		System.out.println(b1.apply(3, 5));

		BinaryOperator<String> b2 = (firstName, lastName) -> lastName + "가" + firstName;
		System.out.println(b2.apply("길동", "홍"));
	}

}
