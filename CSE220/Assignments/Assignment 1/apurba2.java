public class apurba2 {
    public static void main(String[] args) {
        int b = hoc_builder(2);
        System.out.println(b);
    }

    public static int hoc_builder(int height) {
        if (height <= 1) {
            if (height == 0)
                return 0;
            else
                return 5 + 3;
        }
        return 5 + hoc_builder(height - 1);
    }
}
