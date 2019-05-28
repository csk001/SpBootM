package jdk8;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: 88397353
 * @Date: 2019/5/15
 */
public class TestStream {

    private static void testForch(){
        List<String> userList = new ArrayList<>();
        userList.add("zhangsan");
        userList.add("li4");
        userList.add("wang5");
        userList.stream().forEach(na -> System.out.print("name:"+na+"  "));

    }
    private static void testStream(){
        List<String> userList = new ArrayList<>();
        userList.add("zhangsan");
        userList.add("li4");
        userList.add("wang5");
        userList=userList.stream().filter(s -> s.contains("4")).collect(Collectors.toList());//重新赋值

        userList.stream().forEach(na -> System.out.print("name:"+na+"  "));

    }

    private static void testStreamMap(){
        List<String> userList = new ArrayList<>();
        userList.add("zhangsan");
        userList.add("li4");
        userList.add("wang5");
        userList.add("wang5");

        //ID为key，转为Map
//        Map<Long,String> userMap = userList.stream().collect(Collectors.toMap(Person::getId, Person::getName)));

        //根据name来将userList分组
        Map<String, List<String>> groupBy = userList.stream().collect(Collectors.groupingBy(o -> o));
        System.out.println(groupBy);

    }

    public static void main(String[] args) {
        testForch();
        System.out.println();
        System.out.println("--------------");
        testStream();
        System.out.println();
        System.out.println("--------------");
        testStreamMap();
    }
}
