import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		//Read the number from user
		int input = scanner.nextInt();
		System.out.println();
		
		// Check if the number is even or odd
		if (input % 2 == 0) {
			System.out.println("This number is even");
		} else {
			System.out.println("This number is odd");
		}
		
		// Check if the number is negative or positive
		if (input < 0) {
			System.out.println("This number is negative");
		} else {
			System.out.println("This number is positive");
		}
		
		// Check if the number is divisible by 3
		if (input % 3 == 0) {
			System.out.println("Can be devided through 3");
		} else {
			System.out.println("This number can't be devided by 3");
		}
		
		// Check if the number is divisible by 5
		if (input % 5 == 0) {
			System.out.println("Can be devided through 5");
		} else {
			System.out.println("This number can't be devided by 5");
		}
		
		// Close the scanner to avoid memory leak
		scanner.close();
	}

}
