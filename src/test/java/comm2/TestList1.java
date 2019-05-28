package comm2;

public class TestList1 {

    private void checkNull(Dog dog) {
        if (dog == null) {
            System.out.println("111");
        }
        if (dog.getAge() == 10) {
            System.out.println("2222222222");
        }
    }

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.getList().isEmpty());
    }
}
