package api4_String;

import java.util.HashMap;

public class T08_valueOf {
	public static void main(String[] args) {
		// String.valueOf() : ~~자료형들을 문자열로 변환한다.
//		int intSu = 1234;
//		double dblSu = 1234.0;
		Integer intSu = 1234;
		Double dblSu = 1234.0;
		String strSu = "1234";
		HashMap<String , Integer> map = new HashMap<>();
				
		System.out.println(strSu);
		System.out.println(strSu.getClass().getName());
		System.out.println(intSu.getClass().getName());
		System.out.println(dblSu.getClass().getName());
		System.out.println(map.getClass().getName());
		
		int intSu2 = 1234;
		System.out.println("1.intSu + 100 = " + (intSu + 100));
//		String strSu2 = (String) intSu2; // X
//		String strSu2 = intSu2.toString(); // X
		String strSu2 = intSu + ""; // O
		strSu2 = intSu2 + ""; // O
		
		String strSu3 = String.valueOf(intSu2); // O
		System.out.println(strSu3.getClass().getName());
		
		double dblSu4 = 3.14;
		String strSu4 = String.valueOf(dblSu4); // O
		System.out.println(strSu4.getClass().getName());
		System.out.println();
		
		int a1 = 100, a2 = 200;
		int res = a1 + a2;
		System.out.println("res : " + res);
		
		String str5 = String.valueOf(a1) + String.valueOf(a2);
		System.out.println(str5);
		
//		String str6 = (int)String.valueOf(a1) + (int)String.valueOf(a2);
		int res6 = Integer.parseInt(String.valueOf(a1)) + Integer.parseInt(String.valueOf(a2));
		System.out.println("res6 : " + res6);
	}
}
