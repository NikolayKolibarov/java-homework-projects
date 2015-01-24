import java.util.Scanner;
public class _2_TriangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter coordinates of first point A: ");
		float xA = input.nextFloat();
		float yA = input.nextFloat();
		
		System.out.println("Enter coordinates of second point B: ");
		float xB = input.nextFloat();
		float yB = input.nextFloat();
		
		System.out.println("Enter coordinates of third point C: ");
		float xC = input.nextFloat();
		float yC= input.nextFloat();
		
		float area = Math.abs(xA * (yB - yC) + xB * (yC - yA) + xC * (yA - yB)) / 2; 
		System.out.printf("%d",(int)area);
		
		
	}
}
