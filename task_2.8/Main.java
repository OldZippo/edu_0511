public class Main {
    public static void main(String[] args) {
        int iNumber = 1;
        int[] arr = {2,3,4,5};
        for (int i=0; i<4; i++) {
            iNumber=iNumber*arr[i] ;
        }
        System.out.print(iNumber);
    }
}
