public class Main {
    public static void main(String[] args) {
        int num[] = {4,2,6,2,65} ;
        printArr( num, 5);
    }
    static void printArr(int num[], int i) {
        if (i>0) {
            printArr(num,i - 1);
            System.out.println(num[i - 1]);

        }
    }
}
