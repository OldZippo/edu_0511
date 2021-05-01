import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float TC,TF;
        TC = scan.nextFloat();
        TF = (9.0 / 5.0) * TC + 32;
        System.out.println(TF);
    }
}
