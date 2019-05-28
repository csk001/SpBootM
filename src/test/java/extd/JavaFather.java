package extd;

public class JavaFather{
    private String sex;

    static {
        System.out.println("我是java的父亲的静态方法");
    }

    {
        System.out.println("我是java的父亲的初始化方法");
    }

    public JavaFather() {
        System.out.println("我是java的父亲的无参构造函数");
    }

    public JavaFather(String sex) {
        this.sex = sex;
        System.out.println("我是java的父亲的构造函数");
    }

    @Override
    public String toString() {
        return "javaFather{" +
                "sex=" + sex +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
