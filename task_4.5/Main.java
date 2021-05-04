public class Main{
    public static void main(String[] args) {
        Horse mustang = new Horse(3,"Лошадка", "белая");
        mustang.run();
        Pegasus ares = new Pegasus(4,"Летун", "черный");
        ares.fly();
    }
}

abstract class Animal {
    int age;
    String name;
    String color;

    public Animal (int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }
}

class Horse extends Animal {
    public void run() {
        System.out.println("Игого, я поскакал(а)");
    }

    public Horse(int age, String name, String color) {
        super(age, name, color);
    }
}
class Pegasus extends Horse {
    public void fly(){
        System.out.println("Игого, я полетел(а)"); }
    public Pegasus (int age, String name, String color) {
        super(age, name, color);
    }
}
