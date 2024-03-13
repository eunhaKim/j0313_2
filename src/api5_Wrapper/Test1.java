package api5_Wrapper;

// Wrapper 클래스 : 기본 타입을 참조 타입으로(Boxing), 참조 타입을 기본타입으로(UnBoxing) 형변환
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;
		System.out.println("1.intSu1 + 100 : " + (intSu1 + 100));
		
		// 정수형 Boxing처리(Integer) - 기본타입(int) 참조타입(객체)로 타입변환
		Integer objSu1 = new Integer(intSu1); // 중간줄 신경안써도 된다...
		System.out.println("2.objSu1 + 100 : " + (objSu1 + 100));
		
		// 자동박싱 처리의 예
		Integer objSu2;
		objSu2 = intSu1;
		System.out.println("3.objSu2 + 100 : " + (objSu2 + 100));
		
		// UnBoxing
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100 = " + (strIntSu1  + 100) );
		System.out.println("strIntSu1 + 100 = " + (Integer.parseInt(strIntSu1)  + 100) );
		
		// double <-> Double
		double dblSu = 3.14;
		Double objDblSu = new Double(dblSu);
		System.out.println("3.objDblSu + 100.5 : " + (objDblSu + 100.5));
		
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3);
		System.out.println("3.objSu3 + 100 : " + (objSu3 + 100));
		
		
		// UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("su4  + 100 : " + (su4 + 100));
		
	}
}
