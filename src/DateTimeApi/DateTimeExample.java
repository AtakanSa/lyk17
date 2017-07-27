package DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeExample {
public static void  testLocalDateTime() {
	LocalDateTime currentTime = LocalDateTime.now();
	
	LocalDate currentDate = LocalDate.now();
	
	System.out.println("Current Date " + currentDate);
	
	System.out.println("Current Time "+currentTime);
	
	Month month = currentTime.getMonth();
	
	int day = currentTime.getDayOfMonth();
	
	int second = currentTime.getSecond();
	
	System.out.println("Ay = "+ month + "Gün = "+day+"Second = "+second);
	
	LocalDateTime timeExample = currentTime.withDayOfMonth(8).withYear(2018);
	
	System.out.println("dateExample = "+ timeExample);
}

public static void main(String[] args) {
	testLocalDateTime();
}
	
}
