public class Main {
    public static int min(int a, int b, int c, int d) {
        int e = min(a, b);
        int f = min(c, d);
        if (e > f) return f;
        else return e;
    }

    public static int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
