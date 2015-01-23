import java.util.Scanner;
public class _3_SumTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, sum;
		
		System.out.println("Enter number a: ");
		a = input.nextInt();
		
		System.out.println("Enter number b: ");
		b = input.nextInt();
		
		sum = a + b;
		System.out.println(sum);
		
	}
}
