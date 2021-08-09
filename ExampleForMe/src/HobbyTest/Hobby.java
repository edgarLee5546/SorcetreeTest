package HobbyTest;

import java.util.ArrayList;

public class Hobby extends ArrayTest implements Comparable<Hobby> {
	private String name;
	private int level;

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public static void main(String[] agrs) {
		Hobby h1 = new Hobby("Hong", 20);
		Hobby h2 = new Hobby("Park", 40);
		Hobby h3 = new Hobby("Kang", 60);
		Hobby h4 = new Hobby("Lee", 80);
		var hobbys = new ArrayList<Hobby>(100);
		System.out.println();
		for (Hobby other : hobbys) {
			System.out.println(other);
		}
	}

	public Hobby(String name, int level) {
		this.name = name;
		this.level = level;
	}

//	@Override
//	public boolean equals(Object otherObject) {
//		if(this.name.equal(otherObject)) && this.level
//	}
	
	@Override
	public String toString() {
		String hobInfo = "[Name = " + getName() + ", lv = " + level + "]";
		return hobInfo;
	}

	@Override
	public int compareTo(Hobby other) {
		int nameDiff = name.compareTo(other.getName());
		if (nameDiff == 0) {
			return this.level - other.level;
		} else {
			return nameDiff;
		}
	}
}
