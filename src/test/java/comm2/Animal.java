package comm2;

import java.util.List;

public class Animal {
    private String name;
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sing() {
        System.out.println("animal ..");

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Animal [name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

}
