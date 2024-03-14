package api10_Pattern;

import java.util.regex.Pattern;

// 정규식은 Pattern클래스를 사용
// 숫자 : ^[\\d]*$
public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "1A234";
		
		// 정규식을 만들고, 입력데이터와 조건비교 처리한다.
		String regExp = "^[\\d]*$";
		// 1번방법
		Boolean pattern1 = Pattern.compile(regExp).matcher(str1).find();
		Boolean pattern2 = Pattern.compile(regExp).matcher(str2).find();
		
		System.out.println("1. : " + pattern1);
		System.out.println("2. : " + pattern2);
		
		// 2번방법
		Boolean pattern3 = Pattern.matches(regExp, str1);
		Boolean pattern4 = Pattern.matches(regExp, str2);
		System.out.println("3. : " + pattern3);
		System.out.println("4. : " + pattern4);

		System.out.println("5. : " + Pattern.matches(regExp, str1));
		System.out.println("6. : " + Pattern.matches(regExp, str2));
		System.out.println();
		
		// 프로그램에서의 적용예....
		if(Pattern.matches(regExp, str1)) System.out.println("str1은 숫자가 맞습니다.");
		else System.out.println("str1은 숫자가 아닌 값(문자?)을 포함하고 있습니다.");
		
		if(Pattern.matches(regExp, str2)) System.out.println("str2은 숫자가 맞습니다.");
		else System.out.println("str2은 숫자가 아닌 값(문자?)을 포함하고 있습니다.");
		
		
		
	}
}
