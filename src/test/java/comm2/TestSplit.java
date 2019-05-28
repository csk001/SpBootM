package comm2;

import java.util.StringTokenizer;

public class TestSplit {
	public static void main(String[] args) {
		{
			String str = "100|66,55:200|567,90:102|43,54";
			String abc2 = "A|B|C|D";
			StringTokenizer strToke = new StringTokenizer(str, ":");// 默认不打印分隔符
			// StringTokenizer strToke=new StringTokenizer(str,":",true);//打印分隔符
			// StringTokenizer strToke=new StringTokenizer(str,":",false);//不打印分隔符
			int size = strToke.countTokens();// 3 & 5
			System.out.println("strToke count = " + size);
			while (strToke.hasMoreElements()) {
				System.out.println(strToke.nextToken());
				// System.out.println(strToke.nextElement()); //效果同上
			}
			System.out.println("--------------------------");
			// String[] str_abc=str.split("\\|");
			String[] str_abc = str.split(":");
			for (int i = 0; i < str_abc.length; i++) {
				System.out.println(str_abc[i]);
			}

			System.out.println("================");
			System.out.println("12061818".charAt(7));
//			System.out.println("12061818".charAt(8));--超出
		}
	}
}
