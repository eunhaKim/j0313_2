package api9_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {
	public static void main(String[] args) {
		// DecimalFormat() : 데이터 출력 포멧을 지정한다.
		// 서식기호 - 0: 숫자를 표시(해당자리에 숫자가 없으므로 0으로 표시)
		//          #: 숫자를 표시(의미가 없는 0(무효의 제로)을 화면에 출력시켜주지 않는다.
		 double su = 26789.0;
		 System.out.println("원본 : " + su);
		
		 DecimalFormat df = new DecimalFormat();
		 System.out.println("1 : " + df.format(su));
		 
		 df = new DecimalFormat("0"); // 정수만
		 System.out.println("2 : " + df.format(su));
		 
		 df = new DecimalFormat("0,000"); // 네자리 천단위
		 System.out.println("3 : " + df.format(su));
		 
		 df = new DecimalFormat("#,###"); //천단위
		 System.out.println("4 : " + df.format(su));
		 
		 df = new DecimalFormat("#"); 
		 System.out.println("5 : " + df.format(su));
		 
		 df = new DecimalFormat("#,##0"); // 많이쓰는 형태!!! 
		 System.out.println("6 : " + df.format(su));
		 
		 df = new DecimalFormat("#,##0.#");  
		 System.out.println("7 : " + df.format(su));
		 
		 df = new DecimalFormat("#,##0.0");  
		 System.out.println("8 : " + df.format(su));
		 
		 df = new DecimalFormat("@@@@@@@@.0");   //  @@@@@@@@26789.0
		 System.out.println("9 : " + df.format(su));
		 
		 double su2 = 0.9576;
		 df = new DecimalFormat("0.0%");  
		 System.out.println("10 : " + df.format(su2));
		 
		 df = new DecimalFormat("W#,##0");  
		 System.out.println("11 : " + df.format(su));
		 
		 df = new DecimalFormat("\u00A4#,##0"); // 유니코드 원화: \u00A4  ₩26,789
		 System.out.println("11 : " + df.format(su));
		 
		 NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US); // $26,789.00
		 nf.setMinimumFractionDigits(2);
		 System.out.println(nf.format(su));
		 
		 
	}
}
