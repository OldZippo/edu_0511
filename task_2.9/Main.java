public class Main {
    public static void main(String[] args) {
        int iNumber;
        boolean bOk = false;
        int[] arr = {2,3,4,5};
        for (int i=0; i<4; i++) {
            iNumber=arr[i] ;
            if (iNumber==5) bOk =true;
        }
        if (bOk) System.out.print("Yes");
        else System.out.print("No");
    }
}
