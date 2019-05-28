package annotation;

/**
 * @Author: 88397353
 * @Date: 2019/5/28
 */
public class TestMain {
    public static void main(String[] args) {
        User jack=new User();
        jack.setName("jack");
        jack.setAge(66);
        UserCheck.check(jack);
    }
}
