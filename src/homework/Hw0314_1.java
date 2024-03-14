package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Hw0314_1 {
	public static void main(String[] args){
		// 회원명단
		String[][] memberList =  
			{
				{"홍길동", "2000-01-01"},
				{"김말숙", "2020-12-31"},
				{"이기자", "2019-05-20"},
				{"소나무", "2024-03-14"},
				{"아톰맨", "2022-11-22"},
				{"에이맨", "2023-12-11"},
				{"오하늘", "2024-03-14"},
				{"최고봉", "2021-03-14"},
				{"으뜸맨", "2023-05-02"},
				{"사랑이", "2024-03-13"},
				{"감나무", "2022-10-10"},
				{"행복맨", "2000-12-12"},
				{"가나다", "2024-02-28"},
				{"오솔길", "2024-03-01"}	
			};
		
		LocalDate curDate = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("1. 등록된 회원들이 1년이상된 회원들의 명단출력?");
		long month;
		for(int i=0 ; i<memberList.length ; i++) {
			LocalDate memberDate = LocalDate.parse(memberList[i][1],dtf);
			month = memberDate.until(curDate, ChronoUnit.MONTHS);
			if(month>=12) System.out.println("==> " + memberList[i][0]+"님은 가입한지 " + month +"개월 지났습니다.");
		}
		System.out.println();
		
		System.out.println("2. 최근 1달안에 등록된 회원들의 명단과 경과된 일수를 함께 출력?");
		long day;
		for(int i=0 ; i<memberList.length ; i++) {
			LocalDate memberDate = LocalDate.parse(memberList[i][1],dtf);
			day = memberDate.until(curDate, ChronoUnit.DAYS);
			if(day<=30) System.out.println("==> " + memberList[i][0]+"님은 가입한지 " + day +"일 되었습니다.");
		}
	}
}
