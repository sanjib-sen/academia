public class question {
    public static void main(String[] args) {
        String bux[] = { "aaa", "abc", "abd", "acd", "apr", "bac", "bba", "brs", "crp", "cto", "sog" };
        double s = computeTime("bba", bux);
        System.out.println(s);
    }

    public static double computeTime(String s, String source[]) {
        double p = 0.3;
        for (int i = 0; i < source.length; i++) {
            if (s == source[i]) {
                System.out.println("true");
                return p;
            } else {
                p += 0.3;
            }
        }
        System.out.println("false");
        return p;
    }
}
