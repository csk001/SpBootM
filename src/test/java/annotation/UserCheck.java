package annotation;

import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;

/**
 * @Author: 88397353
 * @Date: 2019/5/28
 */
public class UserCheck {

    /**
     * 校验数字的范围，非数字则根据是否为空校验
     *
     * @param user
     */
    public static void check(User user) {
        if (user == null) {
            System.out.println("！！校验对象为空！！");
            return;
        }

        // 获取User类的所有属性（如果使用getFields，就无法获取到private的属性）
        Field[] fields = User.class.getDeclaredFields();

        for (Field field : fields) {
            // 如果属性有注解，就进行校验
            if (field.isAnnotationPresent(ValidateAnt.class)) {
                ValidateAnt validate = field.getAnnotation(ValidateAnt.class);
                if (field.getType().toString().equals("class java.lang.Integer")) {
                    if (user.getAge() == null) {
                        System.out.println("！！年龄可空校验不通过：不可为空！！");
                        return;

                    }
                    if (user.getAge().intValue() < validate.min() || user.getAge().intValue() > validate.max()) {
                        System.out.println("！！年龄校验不通过！！");
                        return;
                    }
                } else {
                    if (validate.isNotNull()) {
                        // 对象的属性的访问权限设置为可访问，否则va获取不到私有属性的值
                        field.setAccessible(true);
                        String va = null;
                        try {
                            va = field.get(user).toString();
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                        if (StringUtils.isEmpty(va)) {
                            System.out.println("！！存在空值！！");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("！！校验通过！！");
    }
}
