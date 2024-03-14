package api8_Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class T4_DateCompare {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2025, 12,31,0,0,0);
		
		System.out.println("남은년도 : " + startDateTime.until(endDateTime, ChronoUnit.YEARS));
		System.out.println("남은월 : " + startDateTime.until(endDateTime, ChronoUnit.MONTHS));
		System.out.println("남은날짜 : " + startDateTime.until(endDateTime, ChronoUnit.DAYS));
		System.out.println("남은시간 : " + startDateTime.until(endDateTime, ChronoUnit.HOURS));
		System.out.println("남은분 : " + startDateTime.until(endDateTime, ChronoUnit.MINUTES));
		System.out.println("남은초 : " + startDateTime.until(endDateTime, ChronoUnit.SECONDS));
	}
}
