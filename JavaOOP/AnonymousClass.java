class Animal {
	public void animalSound() {
		System.out.println("Animal sound");
	}
}

interface Greeting {
	public void sayHello();
}

public class AnonymousClass {
	public static void main(String[] args) {
		Animal myAnimal = new Animal() {
			public void animalSound() {
				System.out.println("Woof woof");
			}
		}; // semicolon required

		Greeting greet = new Greeting() {
			public void sayHello() {
				System.out.println("Hello word!");
			}
		};

		myAnimal.animalSound();
		greet.sayHello();
	}
}