package api3_Class;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스파일이 존재하지 않습니다."+e.getMessage());
		}
		System.out.println("작업끝");
	}
}
