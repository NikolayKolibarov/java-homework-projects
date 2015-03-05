import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter count of numbers: ");
		int count = input.nextInt();
		
		int[] numbers = new int[count];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter Number: ");
			numbers[i] = input.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int number : numbers) {
			System.out.println(number + " ");
		}
	}
}
