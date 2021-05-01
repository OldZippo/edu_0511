public class Main {
    public static void main(String[] args) {
        int iSumm = 0;
        int i = 0;
        int[] arr = {2, 3, 4, 5};
        while (iSumm <= 10) {
            iSumm = iSumm + arr[i];
            i++;
            if (i>=arr.length) {
                System.out.println("Сумма, всех элементов массива, не превышает десяти");
                i = -1;
                break;
            }
        }
        System.out.print(i);
    }
}
