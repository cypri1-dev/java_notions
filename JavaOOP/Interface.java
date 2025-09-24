interface Animal {
	public void animalSound();
	public void sleep();
}

class Pig implements Animal { // don't use 'extends' but 'implements'
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		System.out.println("Zzzz...");
	}
}

public class Interface {
	public static void main(String[] args) {
		Pig myPig = new Pig();
		DemoClass myDemoClass = new DemoClass();

		myPig.animalSound();
		myPig.sleep();

		myDemoClass.myMethod();
		myDemoClass.myOtherMethod();
	}
}

/* ----------- MULTIPLE INTERFACES ----------- */

interface FirstInterface {
	public void myMethod();
}

interface SecondInterface {
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface {
	public void myMethod() {
		System.out.println("My text...");
	}

	public void myOtherMethod() {
		System.out.println("My other text...");
	}
}