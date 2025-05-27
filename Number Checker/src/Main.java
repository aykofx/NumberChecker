import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = scanner.nextInt();
		System.out.println();
		
		if (input % 2 == 0) {
			System.out.println("This number is even");
		} else {
			System.out.println("This number is odd");
		}
		
		if (input < 0) {
			System.out.println("This number is negative");
		} else {
			System.out.println("This number is positive");
		}
		
		if (input % 3 == 0) {
			System.out.println("Can be devided through 3");
		} else {
			System.out.println("This number can't be devided by 3");
		}
		
		if (input % 5 == 0) {
			System.out.println("Can be devided through 5");
		} else {
			System.out.println("This number can't be devided by 5");
		}
		
		scanner.close();
	}

}
