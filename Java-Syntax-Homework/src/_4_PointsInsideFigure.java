import java.util.Scanner;
import java.util.Locale;
public class _4_PointsInsideFigure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Enter coordinates x and y: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if ((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) || (x >= 12.5 && x <= 17.5 && y >= 6 && y <= 13.5) || (x >=20 && x <= 22.5 && y >= 6 && y <= 13.5)) {
			System.out.println("Inside");
		}
		
		else {
			System.out.println("Outside");
		}
	}
}
