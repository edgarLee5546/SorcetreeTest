package PredicateTest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		Supplier<Integer> s1 = () -> {
			return 100;
		};
		System.out.println(s1.get());

		Supplier<User> s3 = () -> new User("Mr.A", 30);
		User u = s3.get();
		System.out.println(u);

		Supplier<List<User>> s4 = () -> {
			List<User> list = new ArrayList<User>();
			list.add(new User("Mr.A", 20));
			list.add(new User("Mr.U", 25));
			list.add(new User("Mr.K", 23));
			return list;
		};
		for (User user : s4.get()) {
			System.out.println(user);
		}
	}
}
