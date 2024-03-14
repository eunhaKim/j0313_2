package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class T4_compare {
	public static void main(String[] args) {
		// 날짜시간비교(주의: 시간 비교시는 ns(나노초)까지 비교해야 된다.)
		LocalDateTime startDateTime = LocalDateTime.now();
		System.out.println("오늘(현재) 날짜/시간 : " + startDateTime);
		System.out.println();
		
		String tempToday = startDateTime.toString();
		String strToday = tempToday.substring(0,tempToday.indexOf("."));
		System.out.println("오늘(현재) 날짜/시간 : " + strToday);
		
		// 날짜와 시간 구분하기(T문자을 기준으로 split()메소드 이용하여 나눈다.)
		String strDate = strToday.split("T")[0]; 
		String strTime = strToday.split("T")[1];
		System.out.println("오늘날짜 : " + strDate);
		System.out.println("오늘시간 : " + strTime);
		System.out.println();
		
		// 비교할 날짜/시간
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 8, 14, 14, 30 , 20);
		String strTarget = targetDateTime.toString();
		System.out.println("비교 날짜/시간 : " + strTarget);
		
		// 날짜와 시간 구분하기(T문자을 기준으로 split()메소드 이용하여 나눈다.)
		String bigyoDate = strTarget.split("T")[0]; 
		String bigyoTime = strTarget.split("T")[1];
		System.out.println("비교날짜 : " + bigyoDate);
		System.out.println("비교시간 : " + bigyoTime);
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		if(strDate.equals(bigyoDate)) System.out.println("같은날");
		else System.out.println("다른날");
		
		// 날짜르 날짜 형식으로 비교하고자 한다면? 
		// isEqual() : 동일날짜비교, 이전날짜비교: isBefore(), 이후날짜비교: isAfter(), 
		// 날짜차이: Period 클래스
		System.out.println("isEqual() : " + startDateTime.isEqual(targetDateTime));
		System.out.println("isBefore() : " + startDateTime.isBefore(targetDateTime));
		System.out.println("isAfter() : " + startDateTime.isAfter(targetDateTime));
		
		// 날짜차이계산(Period클래스)
		LocalDate startDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024,1,14);
		System.out.println("비교"+targetDate);
		System.out.println("시작"+startDate);
		Period period = Period.between(startDate, targetDate);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		System.out.println();
		
		// ***해당월의 마지막 날짜 찾기(_.atEndOfMonth())
		String lastDay = "2024-03-01";
//		LocalDate bigyoDate2 = LocalDate.parse(lastDay,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//		System.out.println(lastDay + "달의 마지막 일자? " + YearMonth.from(bigyoDate2).atEndOfMonth());
		System.out.println(lastDay + "달의 마지막 일자? " + YearMonth.from(LocalDate.parse(lastDay,DateTimeFormatter.ofPattern("yyyy-MM-dd"))).atEndOfMonth());
		
		String lastDay2 = "24-3-2";
		System.out.println(lastDay2 + "달의 마지막 일자? " + YearMonth.from(LocalDate.parse(lastDay2,DateTimeFormatter.ofPattern("yy-M-d"))).atEndOfMonth());
		
		
	}
}
