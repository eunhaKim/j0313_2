package homework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Hw0314_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 회원명단
		String[][] memberList =  
			{
				{"홍길동", "2000-01-01 11:10:30"},
				{"김말숙", "2020-12-31 11:10:30"},
				{"이기자", "2019-05-20 11:10:30"},
				{"소나무", "2024-03-14 11:10:30"},
				{"아톰맨", "2022-11-22 11:10:30"},
				{"에이맨", "2023-12-11 11:10:30"},
				{"오하늘", "2024-03-14 11:10:30"},
				{"최고봉", "2021-03-14 11:10:30"},
				{"으뜸맨", "2023-05-02 11:10:30"},
				{"사랑이", "2024-03-13 11:10:30"},
				{"감나무", "2022-10-10 11:10:30"},
				{"행복맨", "2000-12-12 11:10:30"},
				{"가나다", "2024-02-28 11:10:30"},	
				{"오솔길", "2024-03-01 11:10:30"}	
			};
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("마지막 회원관리 작업일자를 입력하세요? (입력예:2024-03-01 10:10:30)");
		LocalDateTime lastWorkDay = LocalDateTime.parse(sc.nextLine(),dtf);
		long secTime;
		for(int i=0 ; i<memberList.length ; i++) {
			LocalDateTime memberDate = LocalDateTime.parse(memberList[i][1],dtf);
			secTime = memberDate.until(lastWorkDay, ChronoUnit.SECONDS);
			if(secTime<0) System.out.println("==> " + memberList[i][0]+"님은 '가입승인 대기중'입니다.");
		}
		sc.close();
	}
}
