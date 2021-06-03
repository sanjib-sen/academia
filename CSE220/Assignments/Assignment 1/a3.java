public class a3 {
    public static void main(String[] args) {
        int a = hocBuilder(11);
        System.out.println(a);
    }

    public static int hocBuilder(int height) {
        if (height == 1) {
            return 8;
        }
        return 5 + hocBuilder(height - 1);
    }
}
