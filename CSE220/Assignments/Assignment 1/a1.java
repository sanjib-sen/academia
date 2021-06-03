public class a1 {
    public static void main(String[] args) {
        System.out.println(powerN(3, 3));
    }

    public static int powerN(int m, int n) {
        if (n == 1) {
            return m;
        }
        if (n == 0) {
            return 1;
        }
        return m * powerN(m, n - 1);
    }
}
