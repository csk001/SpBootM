package comm2;

import org.apache.commons.lang3.StringUtils;

public class TestNull {
    private static String checkNull(String bb) {
        String aa = null;
        if (bb.equals("22")) {
            aa = "22";

        } else if (bb.equals("33")) {
            aa = "33";
        } else {
            aa = "00";
        }
        return aa;
    }

    private static void checkVoid() {
        //	String bb="";
        String cc = null;
        if ("0".equals(cc)) {
            System.out.println("=====1=========");
        }
        if (StringUtils.isEmpty(cc) || cc.equals("0")) {

            System.out.println("=====2=========");

        }
        if (cc.equals("0")) {
            System.out.println("=====3=========");
        }
    }

    public static void main(String[] args) {
//        System.out.println(checkNull("333"));

        checkVoid();
    }
}
