public class Main {
    public static void main(String[] args) {
        int iNumber;
        int iChek = -1;
        boolean bOk = false;
        int[] arr = {2,3,4,5};
        for (int i=0; i<4; i++) {
            iNumber=arr[i] ;
            if (iNumber==iChek) bOk =true;
            iChek = iNumber;
        }
        if (bOk) System.out.print("Yes");
        else System.out.print("No");
    }
}
