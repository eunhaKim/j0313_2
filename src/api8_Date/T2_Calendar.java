package api8_Date;

import java.util.Calendar;

public class T2_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 싱글톤객체
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("오늘이 몇번째 주 : " + cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println("오늘이 몇번째 일 : " + cal.get(Calendar.DAY_OF_WEEK)); // 일(1),월(2)...토(7)
		System.out.println(cal.get(Calendar.AM_PM)); // am:0 pm:1
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == 0) strAmPm = "오전";
		else strAmPm = "오후";
		System.out.println("지금은 "+strAmPm+" 입니다.");
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch(week) {
//			case Calendar.SUNDAY: strWeek = "일"; break;
//			case Calendar.MONDAY: strWeek = "월"; break;
//			case Calendar.TUESDAY: strWeek = "화"; break;
//			case Calendar.WEDNESDAY: strWeek = "수"; break;
//			case Calendar.THURSDAY: strWeek = "목"; break;
//			case Calendar.FRIDAY: strWeek = "금"; break;
//			case Calendar.SATURDAY: strWeek = "토"; break;
			case 1: strWeek = "일"; break;
			case 2: strWeek = "월"; break;
			case 3: strWeek = "화"; break;
			case 4: strWeek = "수"; break;
			case 5: strWeek = "목"; break;
			case 6: strWeek = "금"; break;
			case 7: strWeek = "토"; break;
		}
		System.out.println("오늘은 "+ strWeek+"요일입니다.");
	}
}
