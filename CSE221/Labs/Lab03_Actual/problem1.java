import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

// Please Delete comments from the input file

public class problem1 {

    public static void main(String[] args) throws Exception {
        File file = new File("input1.txt");
        Scanner sc = new Scanner(file);
        int N = Integer.valueOf(sc.nextInt());
        int M = Integer.valueOf(sc.nextInt());
        int D = Integer.valueOf(sc.nextInt());
        int Q = Integer.valueOf(sc.nextInt());
        LinkedList<LinkedList<String>> adj = new LinkedList<LinkedList<String>>();
        for (int i = 0; i <= N; i++) {
            adj.add(new LinkedList<String>());
        }

        sc.nextLine();
        int tempcount = -1;
        String Flights[] = new String[M];
        while (sc.hasNextLine() && tempcount < M - 1) {
            //
            tempcount++;
            Flights[tempcount] = sc.nextLine();
        }
        int distance[][] = new int[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            String line[] = Flights[i].split(" ");
            int u = Integer.valueOf(line[0]);
            int v = Integer.valueOf(line[1]);
            int d = Integer.valueOf(line[2]);
            String dv = d + " " + v;
            addEdge(adj, u, dv);
        }

        for (int i = 0; i < Q; i++) {
            String comb = sc.nextLine();
            int from = Integer.valueOf(comb.split(" ")[0]);
            int to = Integer.valueOf(comb.split(" ")[1]);
            int cost = dijkstra(adj, N, from, to);
            System.out.println("Case " + (i + 1) + ":\n" + cost);
        }
    }

    private static void addEdge(LinkedList<LinkedList<String>> adj, int u, String dv) {
        adj.get(u).add(dv);
    }

    public static int dijkstra(LinkedList<LinkedList<String>> adj, int N, int source, int destination) {
        int dist[] = new int[N + 1];
        int prev[] = new int[N + 1];

        dist[0] = Integer.MAX_VALUE; // As There is no 0th Vertex, and Vertices started from 1.
        for (int i = 1; i <= N; i++) {
            if (i == source) {
                dist[source] = 0;
                continue;
            }
            dist[i] = Integer.MAX_VALUE;
            prev[i] = -1;
        }

        for (int st = source; st <= N; st++) {
            int u = st;
            for (int i = 0; i < adj.get(u).size(); i++) {
                String combo = adj.get(u).get(i);
                int d = Integer.valueOf(combo.split(" ")[0]);
                int v = Integer.valueOf(combo.split(" ")[1]);
                int alt = dist[u] + d;
                if (alt < dist[v]) {
                    dist[v] = alt;
                    prev[v] = u;
                }
            }
        }

        // For Testing Purpose:
        // for (int i = 1; i < dist.length; i++) {
        // System.out.println("Vertex: " + i + " Distance: " + dist[i]);
        // }

        return dist[destination];
    }
}
