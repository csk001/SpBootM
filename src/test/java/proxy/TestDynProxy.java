package proxy;

public class TestDynProxy {
    public static void main(String[] args) {
        DAOInterface tar= new UserDaoImpl();
        DynamicProxy proxy = new DynamicProxy();
        DAOInterface method = (DAOInterface) proxy.newProxyInstance(tar);
//        method.add();
        method.query("123");
    }
}
