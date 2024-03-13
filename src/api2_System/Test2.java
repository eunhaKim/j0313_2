package api2_System;

public class Test2 {
	public static void main(String[] args) {
		int i, tot = 0;
		
		System.out.println("시작");
		for(i=1;i<=1000000000;i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000이상일때의 i값은? "+i);
//				break;
				return;
			}
		}
		System.out.println("작업끝");
	}
}
