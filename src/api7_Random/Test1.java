package api7_Random;

import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextLong());
		System.out.println(random.nextDouble());
		System.out.println(random.nextFloat());
		System.out.println(random.nextBoolean());
		System.out.println();
		
		System.out.println("0~9 : " + random.nextInt(10));
		System.out.println("1~10 : " + (random.nextInt(10)+1));
		System.out.println("5~10 : " + (random.nextInt(10+1-5)+5));
		// nextInt(끝숫자+1-시작숫자)+시작숫자
		System.out.println("20~30 : " + (random.nextInt(30+1-20)+20));
		System.out.println();
		
		// 클래스안의 매개값으로 난수을 고정시킬 수 있다.
		Random random1 = new Random(5);
		for(int i=1 ; i<=6 ; i++ ) {
			System.out.print((random1.nextInt(45)+1) + " ");
		}
		System.out.println();

		Random random2 = new Random(10);
		for(int i=1 ; i<=6 ; i++ ) {
			System.out.print((random2.nextInt(45)+1) + " ");
		}
		System.out.println();
		
		Random random3 = new Random();
		for(int i=1 ; i<=6 ; i++ ) {
			System.out.print((random3.nextInt(45)+1) + " ");
		}
		System.out.println();
	}
}
