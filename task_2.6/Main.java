import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        a = scan.nextInt();
        b = scan.nextInt();
        c = a%b;
        if (c == 0) System.out.println("Делится = "+a/b);
        else System.out.println("Делится с остатком, остаток = "+ c);
    }
}
