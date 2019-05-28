package comm2;

import java.util.ArrayList;
import java.util.List;

public class TestLast {
public static void main(String[] args) {
    List<String> names=new ArrayList<>();
    names.add("刘备");    //索引为0
    names.add("关羽");    //索引为1
    names.add("张飞");    //索引为2
    names.add("刘备");    //索引为3
    names.add("张飞");    //索引为4
    names.add("曹操");    //索引为5
    System.out.println(names.indexOf("刘备"));
    System.out.println(names.lastIndexOf("刘备"));
    System.out.println(names.indexOf("张飞"));
    System.out.println(names.lastIndexOf("张飞"));
    System.out.println(names.get(names.size()-1));
}
}
