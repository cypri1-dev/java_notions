public class JavaMethod {
	int x = 5;
	/*************************** SIMPLE METHODS ************************** */


	static void myMethod(String fname, int age) {
		System.out.println(fname + " is " + age);
	}

	/*************************** OVERLOADING METHODS ************************** */

	static int plusMethod(int x, int y) {
		return x + y;
	}

	static double plusMethod(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		myMethod("Liam", 5);
		myMethod("Jenny", 8);
		myMethod("Anja", 31);

		int num1 = plusMethod(8, 5);
		double num2 = plusMethod(8.0, 5.0);

		System.out.println("int: " + num1);
		System.out.println("int: " + num2);
		
		JavaMethod myClass = new JavaMethod();
		System.out.println(myClass.x);
	}

}