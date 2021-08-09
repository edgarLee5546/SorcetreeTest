package PredicateTest;

import java.io.IOException;
import java.util.function.Predicate;

public class PredicateTestToMe {

	public static void main(String[] args) throws IOException {

		Predicate<String> match = n -> {
			if ("민".equals(n)) {
				System.out.println("민이네요");
				return true;
			} else {
				System.out.println("민이 아니네요");
				return false;
			}
		};

		System.out.println(match.test("민"));

	}

}
