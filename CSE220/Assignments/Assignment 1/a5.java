public class a5 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        if (n < 0) {
            pattern(n + 1);
            System.out.print(n * (-1) + " ");
        }
        if (n > 0) {
            pattern(n - 1);
            System.out.println();
            pattern((n) * (-1));
        }

    }

}
