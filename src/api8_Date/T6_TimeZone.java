package api8_Date;

import java.util.TimeZone;

public class T6_TimeZone {
	public static void main(String[] args) {
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for(String id  : timeZoneId) {
			System.out.println(id);
		}
	}
}
