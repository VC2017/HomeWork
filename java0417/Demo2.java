package java0417;

import java.util.Calendar;

public class Demo2 {

	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		System.out.println(year+"��"+month+"��"+date+"��");
		calendar.add(Calendar.DATE,20);
		int Year = calendar.get(Calendar.YEAR);
		int Month = calendar.get(Calendar.MONTH)+1;
		int Date = calendar.get(Calendar.DATE);
		//System.out.println(calendar.getTime().toString());
		System.out.println(Year+"��"+Month+"��"+Date+"��");
		
		
		
		/*String str="ABCD";
		byte[] bys = str.getBytes();
		StringBuilder sBuilder = new StringBuilder("");
		for (byte b : bys) {
			sBuilder.append((char)b).append(",");
		}
		sBuilder.deleteCharAt(sBuilder.length()-1);
		System.out.println(sBuilder.toString());
*/
	}

}
