package PredicateTest;

import java.util.function.Consumer;

//@FunctionalInterface
//interface MyConsumer {
//	void accept(String txt);
//}
interface MyNumber {

	int getNum();
}

public class Consumer1 {

	public static void main(String[] args) {
//		MyConsumer c1 = (txt) -> {
//			System.out.println("결과: " + txt);
//		};
//		c1.accept("홍길동");
//	}
//
//		Consumer<String> c2 = (txt) -> System.out.println("결과: " + txt);
//		c2.accept("Mr.Kim");
//		Consumer<Integer> c3 = count -> {
//
//			for (int i = 0; i < count; i++) {
//
//				System.out.println(i);
//
//			}
//
//		};
//		c3.accept(10);
//		BiConsumer<String, Integer> bc = (name, age) -> {
//			System.out.println("이름: " + name);
//			System.out.println("나이: " + age);
//			System.out.println("결과: " + ((age > 19) ? "어른" : "청소년"));
//		};
//
//		bc.accept("Mr.Kim", 18);
		Consumer<MyNumber> c4 = num -> System.out.println(num.getNum());
		c4.accept(new MyNumber() {

			@Override
			public int getNum() {
				return 100;
			}
		});
		c4.accept(() -> {
			return 200;
		});
	}
}