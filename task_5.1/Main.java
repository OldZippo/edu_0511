import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String name;
        int iCount = 0;

        ArrayList<String> names = new ArrayList();
        names.add("Анатолий");
        names.add("Георгий");
        names.add("Руслан");
        names.add("Георгий");
        names.add("Павел");
        names.add("Руслан");

        for (int i = 0; i < names.size(); i++) {
            name = names.get(i);
            for (int j = 0; j < names.size(); j++)
                if (name == names.get(j)) {
                    iCount++;
                    if (iCount >= 2) names.remove(i);
                }
            iCount=0;
        }
        System.out.println(names);
    }
}
