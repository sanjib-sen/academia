public class Sorting {
    public static void main(String[] args) {
        int ar[] = { 4, 2, 1, 6, 3, 5 };
        bubbleSort(ar);
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

    }

    public static void bubbleSort(int source[]) {
        for (int i = source.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (source[j] > source[j + 1]) {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int source[]) {
        for (int i = 0; i < source.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (source[j] > source[j + 1]) {
                    int temp = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void selectionSort(int source[]) {
        for (int i = source.length - 1; i >= 0; i--) {
            int max_idx = 0;
            int max = source[0];
            for (int j = 0; j <= i; j++) {
                if (source[j] > max) {
                    max = source[j];
                    max_idx = j;
                }
            }
            int temp = source[max_idx];
            source[max_idx] = source[i];
            source[i] = temp;
        }
    }

}
