public class auxx {
    public static void main(String[] args) {
        int aux[] = { 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 4, 1 };
        sort(aux, 10);
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
    }

    public static int[] sort(int source[], int x) {
        // Here int x is the total number of integers in the original array, not in aux
        // array.
        int dest[] = new int[10];
        for (int i = 0, j = 0; j < x; i++) {
            int p = source[i];
            while (p > 0) {
                source[j] = i;
                j++;
                p--;
            }
        }
        return dest;
    }

}
