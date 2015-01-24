import java.util.Locale;
import java.util.Scanner;
public class _4_TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Enter number a: ");
		float a = input.nextFloat();
		System.out.println("Enter number b: ");
		float b = input.nextFloat();
		System.out.println("Enter number c: ");
		float c = input.nextFloat();
		
		if (a < b && a < c) {
			System.out.println(a);
		}
		
		if (b < a && b < c) {
			System.out.println(b);
		}
		
		if (c < a && c < b) {
			System.out.println(c);
		}
		
	}
}
