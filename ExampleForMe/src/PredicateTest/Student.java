package PredicateTest;

class Student {
	private String name;
	private int eng;
	private int kor;
	private int math;

	public Student() {

	}

	public Student(String name, int eng, int kor, int math) {
		super();
		this.name = name;
		this.eng = eng;
		this.kor = kor;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		int score = this.getEng() + this.getKor() + this.getMath();
		return String.format("이름 : %s,총점 : %d\n", this.name, score);
	}

}