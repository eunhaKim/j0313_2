package api2_System;
// 시험문제..
public class Test4 {
	public static void main(String[] args) {
		int tot = 0;
		System.out.println("시작");
		
		long startTime = System.nanoTime();
		
		for(int i=1;i<=1000000000;i++) {
			tot += i;
		}
		
		long endTime = System.nanoTime();
		System.out.println("작어베 소모된 시간? " + (endTime - startTime));
		System.out.println("작업끝");
	}
}
