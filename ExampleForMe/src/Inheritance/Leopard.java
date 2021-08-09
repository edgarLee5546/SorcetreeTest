package Inheritance;

public class Leopard extends Animal implements Barkable {
	public String getFood() {
		return "orange";
	}

	public void bark() {
		System.out.println("캬웅");
	}
}
