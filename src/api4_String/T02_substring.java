package api4_String;

public class T02_substring {
	public static void main(String[] args) {
		//             0         1         2
		//             01234567890123456789 
		String msg1 = "Welcome to Korea!!";
		String msg2 = "한국에 방문하신것을 환영합니다!!";
		
		// substring() : 지정된 위치(인덱스번지)의 값을 출력
		// substring(n) : 지정된 위치(인덱스번지)위치부터 마지막까지 문자열을 출력
		// substring(n,m) : 지정된 위치(인덱스번지n)위치부터 마지막(m-1)까지 문자열을 출력
		System.out.println("1.msg1에 3번째 인덱스 위치부터 출력\n"+msg1.substring(3));
		System.out.println("2.msg1에 3번째 인덱스 위치부터 12번째 인덱스 앞까지 출력\n"+msg1.substring(3,12));
		
		// ko~단어를 출력하시오
		System.out.println("ko~"+msg1.indexOf("Ko"));
		System.out.println("!!"+msg1.indexOf("!!"));
		System.out.println("Korea : "+msg1.substring(msg1.indexOf("Ko"),msg1.indexOf("!!")));
		
	}
}
