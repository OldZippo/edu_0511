import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float TC,TF;
        TC = scan.nextFloat();
        TF = (9 / 5) * TC + 32;
        System.out.println(TF);
    }
}
