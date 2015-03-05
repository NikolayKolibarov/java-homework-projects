import java.util.Scanner;
public class _1_SymmetricNumbersInRange {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter starting number: ");
		int startNum = input.nextInt();
		
		System.out.println("Enter ending number: ");
		int endNum = input.nextInt();
		
		if (0 <= startNum && startNum <= endNum && endNum <= 999) {
			for (int i = startNum; i <= endNum; i++) {
				if (i < 10) {
					System.out.println(i);
				}
				
				if (i < 100 && i > 10) {
					int hundreds = (i / 10) % 10; 
					int tens = i % 10;
					if (hundreds == tens) {
						System.out.println(i);
					}
				}
				
				if (i < 1000 && i > 100) {
					int thousands = (i / 100) % 10;
					int tens = i % 10;
					if (thousands == tens) {
						System.out.println(i);
					}
				}
				
				
			}
		}
		
		else {
			System.out.println("Wrong input.");
		}
	}
}
