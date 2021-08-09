package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class User {
	private String name;
	private int age;

	public User() {

	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String.format("%s(%s)", this.name, this.age);
	}
}

public class SimpleLambda {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User("이", 25));
		list.add(new User("김", 20));
		list.add(new User("송", 24));
		list.add(new User("최", 29));
		list.add(new User("박", 21));
		System.out.println("입력 순서 출력: " + list);

		list.sort((o1, o2) -> o2.getAge() - o1.getAge());
		System.out.println("내림 차순 정렬: " + list);

		list.sort((o1, o2) -> o1.getAge() - o2.getAge());
		System.out.println("오름 차순 정렬: " + list);

		TreeSet<User> set = new TreeSet<User>((o1, o2) -> o2.getName().compareTo(o1.getName()));
		set.add(new User("이", 25));
		set.add(new User("김", 20));
		set.add(new User("송", 24));
		set.add(new User("최", 29));
		set.add(new User("박", 21));
		System.out.println("내림 차순 정렬: " + set);

		TreeSet<User> set1 = new TreeSet<User>((o1, o2) -> o1.getAge() - o2.getAge());
		set1.add(new User("이", 25));
		set1.add(new User("김", 20));
		set1.add(new User("송", 24));
		set1.add(new User("최", 29));
		set1.add(new User("박", 21));
		System.out.println("오름 차순 정렬: " + set1);
	}
}
