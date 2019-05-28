package extd;

public class Father {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Father [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append("]");
        return builder.toString();
    }

}
