import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float fSumma, fPersent;
        fSumma = scan.nextFloat();
        fPersent = scan.nextFloat();
        for (int i=0; i<5; i++) {
            fSumma = fSumma + (fSumma/100*fPersent) ;
            System.out.println(fSumma);
            fSumma = fSumma ;
        }
    }
}
