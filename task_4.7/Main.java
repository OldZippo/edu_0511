import java.awt.*;

public class Main {
    public static void main(String[] args){
    Fox scribe = new Fox("Фрося", Color.orange );
    System.out.println(scribe.getName());
    System.out.println(scribe.getColor());
    }
}

interface Animal {
    Color getColor();
}

class Fox implements Animal {
    String name;
    Color color;

    Fox (String name,Color color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
}
