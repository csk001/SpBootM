package common3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegx {
    
    private static boolean checkParam(String regx, String content) {
        // 编译正则表达式
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(content);
        return matcher.find();
//        return matcher.replaceAll("").trim();    
    }

    public static void main(String[] args) {
//        String regx = "^[0-9a-zA-Z_]{1,}$";
        String regx="[`~!@#$%^&*-+{}''\\[\\]<>/?~！@#￥%……&*+——（）={}【】‘”“’、？]|\n|\r|\t";
        System.out.println(checkParam(regx, "(122434好好叙_合合分分AAAqqqzzz"));
        System.out.println(checkParam(regx, "123aa_.ADF_33"));
        System.out.println(checkParam(regx, "."));
        System.out.println(checkParam(regx, "hao好好|，。"));
        System.out.println(checkParam(regx, "1好啊好啊="));//f
        System.out.println(checkParam(regx, "12333_%"));//f
        System.out.println(checkParam(regx, "3 3好好学哈hi一好GGQQkkks "));
    }
}
