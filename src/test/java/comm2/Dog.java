package comm2;

public class Dog extends Animal {
    private int age;

    public void sing() {
        System.out.println("dog ..");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Dog [age=");
        builder.append(age);
        builder.append("]");
        return builder.toString();
    }

}
