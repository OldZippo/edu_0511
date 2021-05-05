import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> numbers1 = new ArrayList();
        numbers1.add(-1);
        numbers1.add(0);
        numbers1.add(1);
        numbers1.add(5);
        numbers1.add(9);
        numbers1.add(10);
        numbers1.add(11);

        ArrayList<Integer> numbers2 = new ArrayList();

        for (i = 0; i < numbers1.size(); i++)
            if (0 < numbers1.get(i) && numbers1.get(i) < 10) numbers2.add(numbers1.get(i));

        System.out.println(numbers2);
    }
}
