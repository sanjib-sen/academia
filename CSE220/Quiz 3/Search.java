public class Search {
    public static void main(String[] args) {
        int ar[] = { 7, 3, 6, 2, 5, 7, 8, 3, 1, 4, 8, 76, 6, 52, 2, 10 };
        if (binarySearch(ar, 51)) {
            System.out.println("Yes!!!");
        }
    }

    public static boolean linearSearch(int source[], int s) {

        for (int i = 0; i < source.length; i++) {
            if (source[i] == s) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int source[], int s) {
        bubbleSort(source);
        int left = 0;
        int right = source.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (s == source[mid]) {
                return true;
            } else if (s > source[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
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
}
