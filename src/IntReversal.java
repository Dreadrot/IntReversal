import java.util.Scanner;

public class IntReversal {
	public static void main(String[] args) {

		// created user input
		Scanner rev = new Scanner(System.in);
		// let the user know about it
		System.out.println("Please give me a number here! ");
		// let computer know the input will be int
		int input = rev.nextInt();
		// created flip to house reverse(input)
		int flip = reverse(input);
		// printed the reversed number
		System.out.println("Your number in reverse is " + flip);

	}

	// created reverse method
	public static int reverse(int number) {
		// declared result for scope, and made it equal to 0 for the while loop
		int result = 0;
		// declared rem for scope purposes
		int rem;
		// run loop while number is greater than 0
		while (number > 0) {
			// select rightmost digit
			rem = number % 10;
			// select all but rightmost digit
			number = number / 10;
			// shifts number over one digit
			result = result * 10;
			//adds the remainder into the rightmost digit
			result = result + rem;
			//Does not work with 0's on ends. Sorry.
		}
		return result;
	}
}