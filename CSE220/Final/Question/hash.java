public class hash {
    public static void main(String[] args) {
        int aux[] = { "aaa", "abc", "abd", "acd", "apr", "bac", "bba", "brs", "crp", "cto", "sog" };
        sort(aux, 10);
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
    }
}