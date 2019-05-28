package reflect;

import java.io.Serializable;

public class Animal implements Serializable {
    /**
     */
    private static final long serialVersionUID = 8808095870197602304L;
    private String name;
    private String speak;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void Speak() {
        System.out.println();
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void hello(String message) {
        System.out.println("hello "+message);
    }
}
