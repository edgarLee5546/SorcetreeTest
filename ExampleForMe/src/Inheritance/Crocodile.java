package Inheritance;

public class Crocodile extends Animal implements BarkablePredator {
	public String getFood() {
		return "strawberry";
	}

	public void bark() {
		System.out.println("쩝쩝");
	}
}
