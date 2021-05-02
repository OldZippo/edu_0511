public class Main {

   public static String IsEqually(int a, int b) {
        if (a == b) return "true";
        else return "false";
   }
    public static void main(String[] args) throws Exception {
        System.out.println(IsEqually(-20, -10));
        System.out.println(IsEqually(-20, -20));
    }
}
