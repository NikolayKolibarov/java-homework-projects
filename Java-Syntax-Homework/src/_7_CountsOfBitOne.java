import java.util.Scanner;
public class _7_CountsOfBitOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		System.out.println("Number of 1 bits: \n" + Integer.bitCount(number));
	}
}
