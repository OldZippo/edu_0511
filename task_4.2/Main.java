public class Main {
    public static void main(String[] args) {
    Dog dachshund = new Dog("Шарик", 5);
    System.out.println(dachshund.getName());
    System.out.println(dachshund.getAge());
    }
}

    class Dog {
    private String name;
    private int age;
    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
