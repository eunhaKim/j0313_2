package api3_Class;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String 클래스가 존재합니다.");
			
			// 객체의 정보(Test1.class) 알아내어 출력하기
			Class clazz = Test1.class;
			System.out.println("전체이름(패키지명+파일명) : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackage());
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("심플이름 : " + clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;
			System.out.println("그림파일의 경로명 : " + imgPath.getResource("./images/121.jpg").getPath());
			System.out.println("Test2.class의 경로명 : " + imgPath.getResource("Test2.class").getPath());
			System.out.println("Test1.class의 경로명 : " + clazz.getResource("Test1.class").getPath());
			System.out.println("현재 작업경로의 루트명 : " + clazz.getResource("/").getPath());
			System.out.println("그림파일의 경로명1 : " + imgPath.getResource("/api3_Class/images/121.jpg").getPath());
			System.out.println("그림파일의 경로명2 : " + imgPath.getResource("/api3_Class/images/122.jpg").getPath());
			System.out.println("api2_System 패키지의 Test1.class의 경로명1 : " + imgPath.getResource("../api2_System/Test1.class").getPath());
			System.out.println("api2_System 패키지의 Test1.class의 경로명2 : " + imgPath.getResource("/api2_System/Test1.class").getPath());
			System.out.println("api2_System 패키지의 Test1.class의 경로명3 : " + Test1.class.getResource("/api2_System/Test1.class").getPath());
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일이 존재하지 않습니다."+e.getMessage());
		} finally {
			System.out.println("작업끝");
		}
	}
}
