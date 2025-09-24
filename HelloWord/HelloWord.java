/*********************************************JAVA TUTORIAL*********************************************/

public class HelloWord {
	public static void main(String[] args) {

		/*************************** COMMENTS ************************** */

		// System.out.print("TEST");

		/* Multiline
		comment */
		/*************************** TYPES ************************** */

		System.out.println("Hello Word");
		System.out.println(7);
		System.out.println(123);
		System.out.println(123 + 7);
		System.out.println(123 * 7);

		String name = "cyferrei";
		int myNum = 29;
		float myFloat = 34.2f;
		double price = 33.12;
		char myChar = 'a';
		final boolean IS_Ok = true;

		System.out.println("My name is " + name + " ,I am " + myNum + "(" + myFloat + ")");
		System.out.print("A random char: " + myChar);
		System.out.println(IS_Ok);
		System.out.println(price);
	
		/*************************** VARIABLES ************************** */
	
		// Create integer variables
		int length = 4;
		int width = 6;
		int area;

		// Calculate the area of a rectangle
		area = length * width;

		// Print variables
		System.out.println("Length is: " + length);
		System.out.println("Width is: " + width);
		System.out.println("Area of the rectangle is: " + area);

		float f1 = 35e3f;
		double d1 = 12.3E4d;
		System.out.println(f1);
		System.out.println(d1);

		/*************************** VAR ************************** */

		var x = 5;
		var y = 3.5;
		System.out.println("[x]: " + x + " | [y]: " + y);

		// 1. var only works when you assign a value at the same time (you can't declare var x; without assigning a value):
		// var x; // Error
		// var x = 5;  // OK

		// 2. Once the type is chosen, it stays the same. See example below:
		// var x = 5;  // x is now an int
		// x = 10;     // OK - still an int
		// x = 9.99;   // Error - can't assign a double to an int

		/*************************** CASTING ************************** */

		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double

		System.out.println(myInt);    // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble2); // Outputs 9.78
		System.out.println(myInt2);    // Outputs 9

		/*************************** STRINGS ************************** */

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Length of the txt is " + txt.length());
		String txt2 = "Please locate where 'locate' occurs!";
		System.out.println(txt2.indexOf("locate")); // Outputs 7

		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));

		String txtSpecial = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txtSpecial);

		/*************************** MATH ************************** */

		System.out.println(Math.min(5, 10));
		System.out.println(Math.max(5, 10));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.abs(-4.7));
		System.out.println(Math.pow(2, 8));
		System.out.println(Math.round(4.6));
		System.out.println(Math.ceil(4.1));
		System.out.println(Math.floor(4.9));
		System.out.println((int)(Math.random() * 101));

		/*************************** BOOLEAN ************************** */
		
		int myAge = 17;
		int voteAge = 18;

		if (myAge >= voteAge)
			System.out.println("You can vote!");
		else
			System.out.println("You can't vote!");

		String answer = (myAge >= voteAge) ? "You can!" : "You can't!";
		System.out.println(answer);

		boolean isLoggedIn = true;
		boolean isAdmin = false;
		int securityLevel = 3; // 1 = highest

		if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
		System.out.println("Access granted");
		} else {
		System.out.println("Access denied");
		}

		String accsess = (isLoggedIn && (isAdmin || securityLevel <= 2) ? "Access granted" : "Access denied");
		System.out.println(accsess);

		/*************************** SWITCH ************************** */

		int day = 4;
		switch (day) {
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
			break;
		default:
			System.out.println("Looking forward to the Weekend");
		}

		/*************************** FOR-EACH ************************** */
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

		for (String car : cars) {
			System.out.println(car);
		}
	}
}