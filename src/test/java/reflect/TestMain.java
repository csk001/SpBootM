package reflect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
        Animal animal = new Animal();
        Class c1 = animal.getClass();
        System.out.println("getClass:" + c1.getName());
        Class c2 = Animal.class;
        System.out.println("class:" + c2);
        Class c3 = Class.forName("reflect.Animal");
        System.out.println("forName:" + c3);
        Animal animal2=(Animal) c1.newInstance();
        animal2.setName("aa");
        System.out.println("name:"+animal2.getName());
        System.out.println("========路径========");
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(animal.getClass().getResource(""));
        System.out.println(animal.getClass().getResource("/"));
        System.out.println(ClassLoader.getSystemResource(""));
        System.out.println(ClassLoader.getSystemClassLoader().getResource(""));
        InputStream iStream=Animal.class.getResourceAsStream("cc.properties");
        
        String data=new BufferedReader(new InputStreamReader(iStream)).readLine().concat(",");
        System.out.println(data);
    }
}
