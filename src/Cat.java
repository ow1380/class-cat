package src;

public class Cat {
    //поля
    private String name;
    private int height;
    private int age;

    // Конструктор по умолчанию
    public Cat() {}

    public Cat(int age, int height, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    //методы
    public void sleep () {
        System.out.println("котик спит");
    }
     public void eat () {
         System.out.println("кушает");
     }
     public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
