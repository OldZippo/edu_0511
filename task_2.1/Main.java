public class Main {
    public static void main(String[] args) {
        String arr[] = {"мама","мыла","раму"};
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; j++)
                if (i != j) System.out.println(arr[i] + arr[j] + arr[arr.length - i - j]);
    }
}
