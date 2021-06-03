public class ApurbaA5a {

    public static void main(String[] args) {

        a5_A(5, 0);

        a5_B(6, 0);
    }

    public static void a5_A(int n, int m) {
        if (m < n) {
            for (int i = 0; i <= m; i++) {
                System.out.print(i + 1);
            }
            System.out.println();
            a5_A(n, m + 1);
        }
    }

    public static void a5_B(int n, int m) {
        if (m < n) {
            for (int i = 1; i <= n - m; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= m + 1; i++) {
                System.out.print(i);
            }
            System.out.println();
            a5_B(n, m + 1);
        }
    }
}
