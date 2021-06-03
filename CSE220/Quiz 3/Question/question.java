public class question {
    public static void main(String[] args) {
        int A[] = { 5, 5, 6, 2, 2, 2, 2, 2, 2, 2, 6, 5, 5 };
        int c = F(A, 0, 12);
        System.out.println(c);
    }

    public static int F(int A[], int L, int R) {
        if (L > R)
            return 0;
        if (A[L] != A[R])
            return 0;
        else
            return 1 + F(A, L + 1, R - 1);
    }
}
