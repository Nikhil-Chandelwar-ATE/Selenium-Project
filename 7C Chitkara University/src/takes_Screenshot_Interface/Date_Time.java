package takes_Screenshot_Interface;

import java.util.Date;

public class Date_Time {

	public static void main(String[] args) {

		Date date = new Date();
		String newDate = date.toString();
		String newDate2 = newDate.replace(' ', '_').replace(':', '_');
		System.out.println(newDate2);
	}

}
