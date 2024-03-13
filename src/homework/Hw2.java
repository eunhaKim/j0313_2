package homework;

import java.util.Scanner;
// 아스키코드 0~9: 48~57 , _:95 , 영어A~Z:65~90, a~z: 97~122
public class Hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String id = "";
		
		login:while(true) {
			System.out.print("아이디를 입력하세요? ");
			id = sc.nextLine();
			
			if(id.length()<4 || id.length()>20) {
				cnt = errMsg(id,cnt);
				System.out.print("계속할까요?(Y/N) ");
				String yn = sc.nextLine().toUpperCase();
				System.out.println("----------------------");
				if(yn.equals("N")) break;
				continue;
			}
			else System.out.println("갯수검사는 통과!");
			
			int checkNum=0;
			for(int i=0 ; i<id.length()+1 ; i++) { // 글자 하나하나 꺼내서 조건에 맞는 글자인지 확인
				if(checkNum == id.length()){
					System.out.println("입력된 아이디"+id+"는 사용하실 수 있습니다.");
					break login;
				}
				checkNum++;
				int idNum = id.charAt(i);
				if(idNum>=48 && idNum<=57) { // 숫자
					System.out.println(id.charAt(i)+"는 숫자라서 OK!");
					continue;
				}
				else if(idNum==95) { // _
					System.out.println(id.charAt(i)+"는 '_'라서 OK!");
					continue;
				}else if(idNum>=65 && idNum<=90) { // 영어A~Z
					System.out.println(id.charAt(i)+"는 영어 A~Z 라서 OK!");
					continue;
				}else if(idNum>=97 && idNum<=122) { // 영어a~z
					System.out.println(id.charAt(i)+"는 영어 a~z 라서 OK!");
					continue;
				}else {// 사용할수없는 문자
					System.out.println(id.charAt(i)+"는 사용할수없는 문자라서 NO!");
					cnt = errMsg(id,cnt);
					System.out.print("계속할까요?(Y/N) ");
					String yn = sc.nextLine().toUpperCase();
					System.out.println("----------------------");
					if(yn.equals("N")) break;
					continue login;
				}
				
			}
		}
		System.out.println(id+"로그인 되었습니다.");
		sc.close();
	}

	private static int errMsg(String id, int cnt) {
		System.out.println("==> 입력된 아이디"+id+"는 사용하실 수 없습니다.");
		cnt++;
		if(cnt%3 == 0) {
			System.out.println("지금부터 20초 사용이 제한됩니다.");
			try {
				for(int i=1 ; i<=20 ; i++) {
					Thread.sleep(1000);
					if(i%5==0) System.out.print(" ");
					else System.out.print("!");
				}
			} catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
		return cnt;
	}
}
