package proxy;

/**
 * 目标对象
 *
 * @author 88397353
 *
 *	2018-10-10
 *
 */
public class UserDaoImpl implements DAOInterface{
    @Override
    public void add() {
        System.out.println("在目标对象中执行add");
    }

    @Override
    public void delete() {
        System.out.println("在目标对象中执行delete");
    }

    @Override
    public void update() {
        System.out.println("在目标对象中执行update");
    }

    @Override
    public void query(String id) {
        System.out.println("在目标对象中执行query :"+id);
    }
}
