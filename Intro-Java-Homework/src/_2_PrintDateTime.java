
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class _2_PrintDateTime {
	public static void main(String[] args) {
		DateFormat dateTime = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateTime.format(date));
	}
}
