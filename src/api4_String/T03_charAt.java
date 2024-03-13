package api4_String;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class T03_charAt {
	public static void main(String[] args) {
		// 성별 코드가 '1'또는 '3'이면 '남자'fh, '2'또는 '4'이면 '여자'로 출력해주세요
		
		
		String jumin = "123456-1234567";
		char gender=jumin.charAt(7);
		String strGender = "";
		switch(gender){
			case '1':
				strGender = "남자";
				break;
			case '2':
				strGender = "여자";
				break;
			case '3':
				strGender = "남자";
				break;
			case '4':
				strGender = "여자";
				break;
			default:
				strGender = "모름";
		}
		System.out.println("주민번호: "+jumin+", 성별 : "+strGender);
	}
}
