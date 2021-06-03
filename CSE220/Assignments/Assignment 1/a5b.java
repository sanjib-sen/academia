public class a5b {
    public static void main(String[] args) {
        pattern(5, 0);
    }

    public static void pattern(int n, int p) {
        if (n == 0) {
            return;
        }
        if (n > 0) {
            space((n - 1) * 2);
            pattern((p + 1) * (-1), p + 1);
            System.out.println();
            pattern(n - 1, p + 1);
        }
        if (n < 0) {
            pattern(n + 1, p);
            System.out.print(n * (-1) + " ");
        }
    }

    public static void space(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(" ");
        space(n - 1);
    }

}