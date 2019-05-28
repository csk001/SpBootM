package reflect;

import java.lang.reflect.Method;

public class Test {
    public static void testP(Animal cc) {
        Animal aaAnimal;
        aaAnimal=cc;
        System.out.println(":"+aaAnimal);
    }
    
    public static void main(String[] args) {
//        /*
//         * Method类，方法的对象 一个成员方法就是一个Method对象 getMethods()方法获取的是所有的public的函数，包括父类继承而来的
//         * getDeclaredMethods()获取的是多有该类自己声明的方法，不问访问权限
//         */
//        Class c = Animal.class;
//        Method[] ms = c.getMethods();// c.getDeclaredMethods();
//        for (int i = 0; i < ms.length; i++) {
//            // 得到方法的返回值类型的类类型
//            Class retrunType = ms[i].getReturnType();
//            System.out.print(retrunType.getName() + " ");
//            // 得到方法的名称
//            System.out.println(ms[i].getName());
//            // 获取的参数类型--->得到的是参数列表的类型的类类型
//            Class[] paraTypes = ms[i].getParameterTypes();
////            for (Class class1 : paraTypes) {
////                System.out.println(class1.getName() + ",");
////            }
//        }
       Animal animal=new Animal();
       animal.setName("111");
        testP(animal); 
    }
}
