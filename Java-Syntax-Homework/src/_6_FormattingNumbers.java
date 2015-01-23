import java.util.Scanner;
public class _6_FormattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		String hex = Integer.toHexString(a);
		String binary = Integer.toBinaryString(a);
	}
}
