enum Level {
	LOW,
	MEDIUM,
	HIGHT
}

public class Enum {
	enum State {
		ON,
		OFF,
		ERROR
	}
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);

		State myTest = State.ON;
		System.out.println(myTest);
	}
}