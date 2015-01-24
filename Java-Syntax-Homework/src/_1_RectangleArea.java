import java.util.Scanner;
public class _1_RectangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int height, width, area;
		System.out.println("Enter height and width of rectangle: ");
		height = input.nextInt();
		width = input.nextInt();
		area = height * width;
		System.out.println(area);
	}
}
