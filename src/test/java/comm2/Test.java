package comm2;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // Animal animal2 = new Dog();
        // Dog animal3 = new Dog();
        // animal.sing();
        // animal2.sing();
        // animal3.sing();
        //
        // System.out.println(animal.toString());
        // System.out.println(animal2.toString());
        // System.out.println(animal3.toString());
        int a = 5;
        if (a < 3) {
            System.out.println("111111111");
        } 
        else if (a < 4) {
            System.out.println("2222222222222");
        }
        System.out.println("333333");
        
        Double d1=1.00d;
        Double d2=1.002d;
        Double d3=1.192d;
        Double d4=1.19299999d;
        Double d5=null;
        System.out.println(String.valueOf(d1));
        System.out.println(String.valueOf(d2));
        System.out.println(String.valueOf(d3));
        System.out.println(String.valueOf(d4));
        System.out.println(String.valueOf(d5));
        System.out.println("----------------------------");
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d3.toString());
        System.out.println(d4.toString());
//        System.out.println(d5.toString());
        
        System.out.println("---------------");
        BigDecimal zero = BigDecimal.ZERO.setScale(1);
        System.out.println("zero: "+zero.toString());
    }
}
