package src;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat(1, 1212, "Клен");
        System.out.println(cat.getName());
        System.out.println(cat1.getName());
    }
}
