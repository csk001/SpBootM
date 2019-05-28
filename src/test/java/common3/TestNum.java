package common3;

import java.math.BigDecimal;

public class TestNum {
    public static String getName(Integer a) {
        BigDecimal b=new BigDecimal(a.intValue());
        System.out.println(b);
        return b.toString();
    }
    public static void main(String[] args) {
        float a = 0.123456789123f;
        float b = 123.123456789123f;
        //System.out.println(a);
       // System.out.println(b);
        //String q="";
        String z="0124";
       // System.out.println(Integer.valueOf(q));//NumberFormatException
        //System.out.println(Integer.valueOf(z));
        
        System.out.println(getName(001));
        System.out.println(getName(002));
        System.out.println(getName(000026));
        
        
    }
}
