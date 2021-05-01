public class Main {
    public static void main(String[] args) {
        int c;
        for (int i=1; i<32; i++) {
            c=31%i;
            System.out.print("31 делится на "+i);
            if (c == 0) System.out.println(" true");
            else System.out.println(" false");
        }
    }
}
