import java.util.Scanner;
// import java.util.* -> import all package

public class Package {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter username:");

		String userName = myObj.nextLine();
		System.out.println("Username is: " + userName);
	}
}