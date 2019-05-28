package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射调用测试
 *
 * @author 88397353
 *
 *         2018-10-10
 *
 */
public class TestInvoke {
    public static void main(String[] args) {
        Class cc = Animal.class;
        // Class cc = Class.forName("reflect.Animal");
        try {
            Object object = cc.newInstance();
            // 反射操作方法，方法名、参数类型
            Method hello = cc.getMethod("hello", String.class);
            hello.invoke(object, "csk");
            System.out.println("===============");
            // 反射操作属性，属性名称
            Field nameField = cc.getDeclaredField("name");
            // 暴力反射，解除私有限定
            nameField.setAccessible(true);
            nameField.set(object, "csk");
            System.out.println("name=" + nameField.get(object));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
