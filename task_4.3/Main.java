public class Main {
    public static void main(String[] args) {

        Cat firstCat = new Cat ();
        firstCat.strength = 10;
        firstCat.age = 5;
        firstCat.weight = 3;

        Cat secondCat = new Cat ();
        secondCat.strength =8;
        secondCat.age = 6;
        secondCat.weight = 4;

        System.out.println(firstCat.fight(secondCat));

    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {

        boolean isVictory = true;
        int Criterions= 0;

        if (this.age > anotherCat.age) Criterions++;
        else Criterions--;
        if (this.weight > anotherCat.weight) Criterions++;
        else Criterions--;
        if (this.strength > anotherCat.strength) Criterions++;
        else Criterions--;

        if(Criterions <= 0) isVictory = false;

        return isVictory;
    }
}
