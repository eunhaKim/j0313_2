package api4_String;

import java.io.UnsupportedEncodingException;

public class T04_getBytes {
	public static void main(String[] args) {
		// 아스키코드 : 영문1글자 - 1Byte, 한글1글자 - 2Byte
		// EUC-KR : 영문 - 1Byte, 한글 - 2Byte
		// 유니코드 : UTF-8 영문 - 1Byte, 한글 - 3Byte
		String str1 = "안녕하세요!";
		String str2 = "Hello!";
		
		System.out.println("str1의 길이 : "+str1.length());
		System.out.println("str2의 길이 : "+str2.length());
		System.out.println();
		
		byte[] b1 = str1.getBytes();//알아서 문자열은 byte로 바꿔서 배열로 바꿔줌..
		System.out.println("b1의 길이 : " + b1.length);
		byte[] b2 = str2.getBytes();//알아서 문자열은 byte로 바꿔서 배열로 바꿔줌..
		System.out.println("b2의 길이 : " + b2.length);
		System.out.println();

		// 인코딩 / 디코딩
		try {
			// eun-kr
			// 한글 인코딩 / 디코딩
			byte[] b3 = str1.getBytes("euc-kr");
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString()); // toString()은 생략가능
			System.out.println("b3[0] : "+b3[0]);
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~");
			String str3 = new String(b3, "euc-kr"); // 디코딩
			System.out.println("str3 : " + str3);
			System.out.println();
			
			// 영문 인코딩 / 디코딩
			byte[] b4 = str2.getBytes("euc-kr");
			System.out.println("b4의 길이 : " + b4.length);
			System.out.println("b4 : " + b3.toString()); // toString()은 생략가능
			System.out.println("b4[0] : "+b4[0]);
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~");
			String str4 = new String(b4, "euc-kr"); // 디코딩
			System.out.println("str4 : " + str4);
			System.out.println("======================");

			// utf-8
			// 한글 인코딩 / 디코딩
			b3 = str1.getBytes("utf-8");
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString()); // toString()은 생략가능
			System.out.println("b3[0] : "+b3[0]);
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~");
			str3 = new String(b3, "utf-8"); // 디코딩
			System.out.println("str3 : " + str3);
			System.out.println();
			
			// 영문 인코딩 / 디코딩
			b4 = str2.getBytes("utf-8");
			System.out.println("b4의 길이 : " + b4.length);
			System.out.println("b4 : " + b3.toString()); // toString()은 생략가능
			System.out.println("b4[0] : "+b4[0]);
			System.out.println("~~~~~~~~~~~전송중~~~~~~~~~");
			str4 = new String(b4, "utf-8"); // 디코딩
			System.out.println("str4 : " + str4);
			System.out.println();
		} catch (UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
