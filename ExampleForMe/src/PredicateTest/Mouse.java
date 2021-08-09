package PredicateTest;

class Mouse implements Comparable<Mouse> {
	private String name;
	private int price;

	public Mouse() {

	}

	public Mouse(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("[이름 : %s]\n[가격 : %d]\n", this.name, this.price);
	}

	@Override
	public int compareTo(Mouse m) {
		if (m instanceof Mouse) {
			Mouse m2 = (Mouse) m;
			if (this.name.equals(m2.getName()) && this.price == m2.price) {
				return 1;
			}
		} else {
			return -1;
		}
		return 0;
	}
}
