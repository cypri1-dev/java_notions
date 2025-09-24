class Second {
	public static void main(String[] args) {
		JavaOPP myObj1 = new JavaOPP();
		JavaOPP myObj2 = new JavaOPP();
		JavaOPP myObj3 = new JavaOPP();

		myObj1.x = 40;
		System.out.println(myObj1.x);
		System.out.println(myObj2.x);
		System.out.println(myObj2.fname);

		// staticMethod(); -> can't be called here
		myObj1.publicMethod(); // can also be called here

		// y set with CONSTRUCTOR
		System.out.println(myObj3.y);
	}
}