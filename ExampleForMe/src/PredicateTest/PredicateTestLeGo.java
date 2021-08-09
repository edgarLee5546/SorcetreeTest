package PredicateTest;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTestLeGo extends Student {

	public static void main(String[] args) {
		Predicate<Integer> p1 = n -> n > 0;
		System.out.println(p1.test(0) ? "양수" : "양수가 아니다");

		Predicate<String> p2 = s -> s.length() > 10;
		System.out.println(p2.test("홍길동입니다.") ? "긴문장" : "짧은 문장");

		Predicate<Student> p3 = s -> (s.getEng() + s.getKor() + s.getMath()) > 240;
		System.out.println(p3.test(new Student("홍길동", 100, 80, 90)) ? "합격" : "불합격");

		BiPredicate<String, String> p4 = (s1, s2) -> s1.length() > s2.length();
		System.out.println(p4.test("홍길동", "흥민"));
		System.out.println();

		Student student = new Student("Mr.kim", 100, 95, 90);

		Function<Student, Integer> f1 = s -> s.getKor() + s.getEng() + s.getMath();
		Function<Integer, String> f2 = n -> n >= 240 ? "합격" : "불합격";

		int total = f1.apply(student);
		String result = f2.apply(total);
		System.out.println(student.toString() + "결과 : " + result);

		Function<Student, String> f3 = f1.andThen(f2);
		System.out.println(student.toString() + "결과 : " + f3.apply(student));

		Function<Student, String> f4 = f2.compose(f1);
		System.out.println(student.toString() + "결과 : " + f4.apply(student));
		System.out.println();

		Predicate<Integer> a1 = n -> n % 2 == 0;
		Predicate<Integer> a2 = n -> n % 5 == 0;

		int num = 4;

		if (a1.test(num)) {

			System.out.println("2의 배수입니다.");

		} else if (a2.test(num)) {

			System.out.println("5의 배수입니다.");

		}

		Predicate<Integer> a3 = a1.and(a2);

		if (a3.test(num)) {

			System.out.println("2와 5의 공배수입니다.");

		}
	}

}
