package proxy;

/**
 * 静态代理：静态代理中，一个目标对象对应一个代理对象，
 *
 * @author 88397353
 * <p>
 * 2018-10-10
 */
public class StaticProxy implements DAOInterface {
    UserDaoImpl userDao = null;

    public StaticProxy(DAOInterface userDao) {
        if (userDao.getClass() == UserDaoImpl.class) {
            this.userDao = (UserDaoImpl) userDao;
        }
    }

    @Override
    public void add() {
        userDao.add();
        System.out.println("after add 。。。");
    }

    @Override
    public void delete() {
        userDao.delete();
        System.out.println("after delete 。。。");
    }

    @Override
    public void update() {
        userDao.update();
        System.out.println("after update 。。。");
    }

    @Override
    public void query(String id) {
        userDao.query(id);
        System.out.println("after query 。。。");
    }

}
