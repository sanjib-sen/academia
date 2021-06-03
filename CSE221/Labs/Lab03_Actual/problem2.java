import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;

// Please Delete comments from the input file

public class problem2 {

    public static void main(String[] args) throws Exception {
        File file = new File("input2.txt");
        Scanner sc = new Scanner(file);
        int N = Integer.valueOf(sc.nextLine());
        int M = Integer.valueOf(sc.nextLine());

        LinkedList<LinkedList<String>> adj = new LinkedList<LinkedList<String>>();
        for (int i = 0; i < N; i++) {
            adj.add(new LinkedList<String>());
        }

        int tempcount = 0;
        String Flights[] = new String[M];
        while (sc.hasNextLine() && tempcount < M) {
            Flights[tempcount] = sc.nextLine();
            tempcount++;
        }

        for (int i = 0; i < M; i++) {
            String line[] = Flights[i].split(",");
            int u = Integer.valueOf(line[0]);
            int v = Integer.valueOf(line[1]);
            int d = Integer.valueOf(line[2]);
            String dv = d + " " + v;
            addEdge(adj, u, dv);
        }

        int src = Integer.valueOf(sc.nextLine());
        int dest = Integer.valueOf(sc.nextLine());
        // System.out.println(src + " " + dest);
        String forbiddensource[] = sc.nextLine().split(",");
        int forbidden[] = new int[M];
        for (int i = 0; i < forbiddensource.length; i++) {
            forbidden[Integer.valueOf(forbiddensource[i])] = 1;
        }

        String areas[] = { "Mouchak", "Panthapath", "Rampura", "Shahahbagh", "Dhanmondi", "Lalmatia", "Badda",
                "Hatirjheel", "Nilkhet", "TSC", "Dhaka University", "BUET" };

        dijkstra(adj, N, src, dest, forbidden, areas);
    }

    private static void addEdge(LinkedList<LinkedList<String>> adj, int u, String dv) {
        adj.get(u).add(dv);
        // System.out.println("vertex " + u + " dv " + dv);
    }

    public static void dijkstra(LinkedList<LinkedList<String>> adj, int N, int source, int destination, int[] forbidden,
            String[] areas) {
        int dist[] = new int[N + 1];
        int prev[] = new int[N + 1];

        for (int i = 0; i < N; i++) {
            if (i == source) {
                dist[source] = 0;
                continue;
            }
            dist[i] = Integer.MAX_VALUE;
            prev[i] = -1;
        }

        for (int st = source; st < N; st++) {
            if (forbidden[st] == 1) {
                continue;
            }
            int u = st;
            for (int i = 0; i < adj.get(u).size(); i++) {
                String combo = adj.get(u).get(i);
                int d = Integer.valueOf(combo.split(" ")[0]);
                int v = Integer.valueOf(combo.split(" ")[1]);
                if (forbidden[v] == 1) {
                    continue;
                }
                int alt = dist[u] + d;
                if (alt < dist[v]) {
                    dist[v] = alt;
                    prev[v] = u;
                }
            }
        }

        // For Testing Purpose:
        // for (int i = 0; i < dist.length; i++) {
        // System.out.println("Vertex: " + i + " Distance: " + dist[i] + "Previous " +
        // prev[i]);
        // }
        int dest = destination;
        int cur = destination;
        String strAreas = "";
        while (cur != source) {
            cur = prev[destination];
            // System.out.println(cur);
            strAreas += cur + " ";
            destination = cur;
        }
        String arAreas[] = strAreas.split(" ");
        for (int i = arAreas.length - 1; i >= 0; i--) {
            System.out.print(areas[Integer.valueOf(arAreas[i])] + "->");
        }
        System.out.println(areas[dest]);
        System.out.println("Path Cost: " + dist[dest]);
    }
}
