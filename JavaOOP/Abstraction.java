abstract class Animal {
	//abstract method - no body - must be defined in child class
	public abstract void animalSound();

	//regular method
	public void sleep() {
		System.out.println("Zzzz...");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Pig myPig = new Pig();

		myPig.animalSound();
		myPig.sleep();
	}
}