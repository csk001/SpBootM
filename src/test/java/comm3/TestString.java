package comm3;

import java.text.DecimalFormat;

public class TestString {
    public static void main(String[] args) {
        String aa = "123";
        System.out.println(aa);
        String aft = "%s_ing";
        System.out.println(String.format(aft, aa));
        System.out.println(String.format("%04d", 99)); 
        System.out.println(String.format("%04d", 1420028));
        DecimalFormat format2 = new DecimalFormat("###,###.00");
        System.out.println(format2.format(12000.346));//输出12.3
        System.out.println(new DecimalFormat("###,###.00").format(194.039));
        System.out.println(String.format("%.2f", 12.3d));
        System.out.println(String.format("%.2f", 12f));
        System.out.println(String.format("%.2f", 12.346));
        System.out.println(String.format("%-6s", "abcd").replace(' ', '0'));
        
    }
}
