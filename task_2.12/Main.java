import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[];
        arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
        }
        int iCount = 1;
        int iNumber = -1;
        int iResult = -1;
        for (int i = 0; i < 10; i++) {
            if (iNumber == arr[i])
                iCount++;
            else {
                iNumber = arr[i];
                iCount = 1;
            }
            if (iCount > iResult)
                iResult = iCount;
            {

            }
        }
        System.out.println(iResult);
    }
}
