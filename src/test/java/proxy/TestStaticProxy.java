package proxy;

public class TestStaticProxy {
    public static void main(String[] args) {
        DAOInterface tar= new UserDaoImpl();
        DAOInterface method = new StaticProxy(tar);
        method.add();
        method.query("111");
    }
}
