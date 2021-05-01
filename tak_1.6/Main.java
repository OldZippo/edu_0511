import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double dIn,dOut;
        dIn = scan.nextDouble();
        dOut = dIn / 100 * 15 + dIn;
        System.out.println(dOut);
    }
}
