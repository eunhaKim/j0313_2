package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T3_LocalDate {
	public static void main(String[] args) {
		// LocalDate 객체
		LocalDate curDate = LocalDate.now();
		System.out.println("오늘날짜 : " + curDate);
		
		// 날짜 타입의 변수생성, 날짜 지정 셋팅
		curDate = LocalDate.of(2024, 3, 14);
		System.out.println("오늘날짜 : " + curDate);
		
		// 시스템의 현재 시간정보 가져오기
		LocalTime curTime = LocalTime.now();
		System.out.println("현재시간 : " + curTime);
		System.out.println("현재시간 : " + curTime.toString().substring(0,8));
		
		// 시간 지정 셋팅
		LocalTime targetTime = LocalTime.of(12,50,30);
		System.out.println("설정 시간 : " + targetTime);
		
		// 날짜 시간
		LocalDateTime curTime2 = LocalDateTime.now();
		System.out.println("오늘 날짜 시간 : " + curTime2);
		System.out.println("오늘 날짜 : " + curTime2.toString().split("T")[0]);
		System.out.println("오늘 시간 : " + curTime2.toString().split("T")[1].substring(0,8));
		
		// 날짜/시간 지정 셋팅
		LocalDateTime targetDateTime2 = LocalDateTime.of(2024,3,14,13,5,10);
		System.out.println("설정 날짜/시간 : " + targetDateTime2);
		System.out.println();
		
		// 날짜 연산하기...
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd (E) a HH:mm:ss");
		System.out.println("현재 날짜/시간 :" + now.format(dtf));
		
		LocalDateTime res = now.plusYears(1);
		System.out.println("1년 더하기 : " + res.toString().substring(0,4)+"년");
		
		res = now.minusYears(1);
		System.out.println("1년 빼기 : " + res.toString().substring(0,4)+"년");
		
		res = now.plusMonths(2);
		System.out.println("2월 더하기 : " + res.toString().substring(5,7)+"월");
		
		res = now.minusMonths(2);
		System.out.println("2월 빼기 : " + res.toString().substring(5,7)+"월");
		
		res = now.plusDays(7);
		System.out.println("7일 더하기 : " + res.toString().substring(8,10)+"일");
		
		res = now.minusDays(7);
		System.out.println("7일 빼기 : " + res.toString().substring(8,10)+"일");
		System.out.println();
		
		
	}
}
