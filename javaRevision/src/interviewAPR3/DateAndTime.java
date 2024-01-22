package interviewAPR3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		
		String d1 = "2001-04-15";
		String d2 = "2022-02-19";
		
		Period dif = Period.between(LocalDate.parse(d2).withDayOfMonth(1), LocalDate.parse(d1).withDayOfMonth(1));
		System.out.println("date dif "+dif);
		System.out.println(new Date());
		System.out.println( LocalDate.now());
		
	}
}
