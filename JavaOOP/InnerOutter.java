class OuterClass {
	int x = 10;

	/* static */ class InnerClass {
		int y = 5;
		
		public int myInnerMethod() {
			return x;
		}
	}
}

public class InnerOutter {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		// OuterClass.InnerClass myInner = new OuterClass.InnerClass(); // if inner is static !

		System.out.println(myInner.y + myOuter.x);
		// System.out.println(myInner.y); // if inner is static
		System.out.println(myInner.myInnerMethod()); // access to parent attributes
	}
}