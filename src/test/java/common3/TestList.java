package common3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<String> bb = Arrays.asList("2", "3", "3","4", "5");
        List<String> aa = new ArrayList<>(bb);
        List<String> cc = new ArrayList<>(bb);
//        for (String d : cc) {
//            if (d.equals("3")) {
//                cc.remove(d);
//            }
//        }迭代器内部的每次遍历都会记录List内部的modcount当做预期值，
//        然后在每次循环中用预期值与List的成员变量modCount作比较，但是普通list.remove调用的是List的remove，这时modcount++，
//        但是iterator内记录的预期值=并没有变化，所以会报错
        for(int i=0;i<cc.size();i++) {
            System.out.println(cc.get(i));
            if("3".equals(cc.get(i))) {
               cc.remove(i); 
            }
        }
        Iterator<String> iterator = aa.iterator();
        while (iterator.hasNext()) {
            String a1 = iterator.next();
            if (a1.equals("3")) {
                iterator.remove();
            }
        }
        System.out.println("aa:"+aa.toString());
        System.out.println("cc"+cc.toString());
    }
}
