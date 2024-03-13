package api1_Object;

import java.util.HashMap;

class Aa {
	String name;
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	public Bb(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((Bb)obj).name) return true;
		else return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
public class T1_hashCode1 {
	public static void main(String[] args) {
		// HashMap
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "데이터1");
		map.put(1, "데이터2"); // 키값이 같으면 덮어쓰기
		map.put(2, "데이터3");
		System.out.println(map);
		
		HashMap<Aa, String> map2 = new HashMap<>();
		map2.put(new Aa("첫번째"), "데이터1");
		map2.put(new Aa("첫번째"), "데이터2");
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		HashMap<Bb, String> map3 = new HashMap<>();
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2");
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map3);
	}
}
