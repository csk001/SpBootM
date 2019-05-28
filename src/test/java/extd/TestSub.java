package extd;

import java.awt.image.ColorConvertOp;

public class TestSub {
    public static void ConvertOp(Father father) {
        father.setName("AA");
    }

    public static void main(String[] args) {

        Father father = new Father();
        father.setAge("96");
        father.setName("MMM");
        // Son son= father;
        // System.out.println(son.toString());
        Son son = new Son();
        ConvertOp(son);
        System.out.println(son.getName());
    }
}
