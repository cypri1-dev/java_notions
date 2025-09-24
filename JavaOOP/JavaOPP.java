public class JavaOPP {
	int x = 5;
	// final int x = 5; -> no override !
	String fname = "John";
	int y;

	// CONSTRUCTOR //
	public JavaOPP() {
		y = 10;
	}

	static void staticMethod() {
		System.out.println("This is a STATIC method! Can be called without creating an object!");
	}

	public void publicMethod() {
		System.out.println("This is a PUBLIC method! Must create an object to be called!");
	}
	
	public static void main(String[] args) {
		JavaOPP myObj1 = new JavaOPP();
		JavaOPP myObj2 = new JavaOPP();

		System.out.println(myObj1.x);
		System.out.println(myObj2.x);

		myObj1.publicMethod(); // can be called here
		staticMethod(); // can be called here
	}
}