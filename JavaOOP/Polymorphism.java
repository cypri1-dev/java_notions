class Animal {
	String type = "Animal";
	public void animalSound() {
		System.out.println("The animal makes a sound!");
	}

	Animal() {
		System.out.println("Animal is created");
	}
}

class Pig extends Animal {
	String type = "Pig";
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void printType() {
		System.out.println(super.type); // will print type value from parent class
	}
}

class Dog extends Animal {
	public void animalSound() {
		super.animalSound(); // will call method from parent class
		System.out.println("The dog says: wouaf wouaf");
	}

	Dog() {
		super(); // will call constructor from parent class
		System.out.println("Dog is created");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Pig myPig = new Pig();
		Dog myDog = new Dog();

		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();

		myPig.printType();
	}
}