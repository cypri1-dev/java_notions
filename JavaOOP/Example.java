public class Example {
	int modelYear;
	String modelname;
	private int odometer;

	// Constructor with 1 param
	public Example (String name) {
		this(2020, name);
		setOdometer(123432);
	}
	
	// Constructor with 2 params
	public Example(int year, String name) {
		this.modelYear = year;
		this.modelname = name;
	}

	public void printInfo() {
		System.out.println(modelYear + " " + modelname);
		System.out.println(getOdometer());
	}

	// SETTER - GETTER
	public void setOdometer(int km) {
		this.odometer = km;
	}

	public int getOdometer() {
		return this.odometer;
	}

	/*	USING THIS: When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
					To call another constructor in the same class and reuse code. */
	public static void main(String[] args) {
		Example myCar1 = new Example(1969, "Mustang");
		// System.out.println(myCar.modelYear + " " + myCar.modelname);
		myCar1.printInfo();

		Example myCar2 = new Example("Corvette");
		Example myCar3 = new Example(1969, "Corvette");
		
		myCar3.setOdometer(8972342);
		myCar2.printInfo();
		myCar3.printInfo();
	}
}