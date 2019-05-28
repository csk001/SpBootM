package comm1;

import java.util.Arrays;
import java.util.List;

public class TestList {

    public static String getN() {
        try {
            String[] ss = { "a" };
            String b = ss[2];
            List<String> list=Arrays.asList(ss);
            if(list.contains("a")) {
                
            }
        } catch (Exception e) {
            System.out.println("error....");
        }
        return "sss";
    }

    public static void main(String[] args) {

        System.out.println(getN());
    }
}
