package homework;

import java.util.Scanner;

public class Hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("화일명을 입력하세요? ");
			String fileName = sc.next();
			if(!fileName.contains(".")) {
				System.out.println("파일명이 잘못되었습니다. 다시입력해주세요~ ");
				System.out.println("============================\n");
				continue;
			}
			String fileType = "";
			String[] fnArr = fileName.split("\\."); // [.] 또는 \\.
			String[] fileTypeArr = {"jpg","txt","zip","xlsx","hwp","gif"};
			String[] fileTypeInfoArr = {"그림파일","텍스트파일","압축파일","엑셀파일","한글파일","그림파일"};
			
			int cnt = 0;
			for(String ft : fileTypeArr) {
				if(fnArr[fnArr.length-1].equals(ft)) fileType = fileTypeInfoArr[cnt];
				cnt++;
			}
			if(fileType.isBlank()) System.out.println("알수없는 파일 형식입니다.");
			else System.out.println(fileName+" ==> "+fileType);
			
			System.out.print("계속할까요? (Y/N) ");
			String yn = sc.next().toUpperCase();
			System.out.println("============================\n");
			if(yn.equals("N")) break;
		}
		
		System.out.println("수고하셨습니다.");
		sc.close();
	}
}
