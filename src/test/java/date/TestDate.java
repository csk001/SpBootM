package date;

import java.math.BigDecimal;

public class TestDate {
	public static void testOneScale() {

		String[] arr = { "1.00", "1.01", "1.05", "1.0", "2.1", "2","0","0.01","0.00" };
		for (int i = 0; i < arr.length; i++) {

			String tempData = new BigDecimal(arr[i]).setScale(1, BigDecimal.ROUND_HALF_UP).toString();
			System.out.println(arr[i] + " : " + tempData);
		}
	}
		 
		 public static void testAbsOne() {

			String[] arr = { "9.9", "9", "10.0", "10", "-10", "-9.9","0" };
			for (int i = 0; i < arr.length; i++) {
				BigDecimal tt=new BigDecimal(arr[i]);
				if (tt.abs().compareTo(new BigDecimal("10"))==0) {
					System.out.println(tt);
				}
				
			}
		}
		 
		 public  static void testNumber() {
			 Long a0=new Long("123");
			 long a1=(long) 123.01;
			 System.out.println(a0);
			 System.out.println(a0.longValue());
			 System.out.println(a1);
		 }
	public static void main(String[] args) {
		testNumber();
	}
}
