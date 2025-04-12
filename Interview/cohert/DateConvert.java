package cohert;

import java.time.LocalDate;
import java.time.Period;

public class DateConvert {

	public static void main(String[] args) {
		
		int date=11,mon=04,year=2003;
		
		LocalDate today=LocalDate.now();
		LocalDate birth=LocalDate.of(year, mon, date);
		
		Period p=Period.between(today, birth);
		System.out.println(p);
		
		System.out.println("Date"+p.getDays()+" Month"+p.getMonths()+" Year"+p.getYears());
		
	}
}
