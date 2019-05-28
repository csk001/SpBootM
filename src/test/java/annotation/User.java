package annotation;

/**
 * @Author: 88397353
 * @Date: 2019/5/28
 */
public class User {
    @ValidateAnt(isNotNull = false)
    private String name;

    @ValidateAnt(min = 10, max = 99)
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
