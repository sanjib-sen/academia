import java.io.File;
import java.io.FileNotFoundException;
//import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Swad
 */
public class level03 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner p = new Scanner(System.in);
        System.out.println("Enter number of different fixed positions (including Nora’s one)");
        int a = p.nextInt();
        int dist[] = new int[a];
        int pred[] = new int[a];
        ArrayList<ArrayList<Integer>> adjacent = new ArrayList<>(a);// need to check
        for (int i = 0; i < a; i++) {
            adjacent.add(new ArrayList<>());
        }
        System.out.println("Enter number of connections: ");
        int edge = p.nextInt();
        // System.out.println(v);
        // System.out.println(edge);
        // System.out.println("Enter the all those connected positions as pair: ");

        File file = new File("input.txt");
        Scanner pf = new Scanner(file);

        while (pf.hasNextLine()) {
            int u = 0;
            int v = 0;

            String st = pf.nextLine();
            Scanner fromSt = new Scanner(st);

            while (fromSt.hasNextInt()) {

                u = fromSt.nextInt();
                v = fromSt.nextInt();
                // System.out.println(u);
                // System.out.println(v);
                // adjacent.get(u).add(v);
                adjacent.get(v).add(u);

            }
        }
        System.out.println("number of participents you want to enter without Counting Lina:");
        int k = p.nextInt();
        int player[] = new int[k + 1];
        int winner[][] = new int[2][a];
        System.out.println("Enter Lina's position: ");
        int dest = p.nextInt();
        player[0] = dest;
        for (int i = 1; i < player.length; i++) {
            System.out.println("Enter the participents positions: ");
            player[i] = p.nextInt();
        }

        BFS(adjacent, dest, 0, a, dist, pred);
        // System.out.println(dist[dest]);
        /*
         * for (int i = 1; i < player.length; i++) { winner[i]=Math.abs(dist[player[i]]
         * -dist[player[0]]); }
         */

        for (int j = 0; j < winner.length; j++) {
            winner[1][j] = dist[j];
        }

        for (int i = 1; i < player.length; i++) {
            winner[0][player[i]] = 1;
        }
        int win = winner[1][0];
        for (int i = 0; i < winner.length; i++) {
            if (winner[1][i] < win && winner[0][i] == 1) {
                win = winner[1][i];
            }
        }
        System.out.println(win - 1);

    }

    public static void BFS(ArrayList<ArrayList<Integer>> adjacent, int src, int dest, int lim, int dist[], int pred[]) {

        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[lim];
        for (int i = 0; i < lim; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
        visited[src] = true;
        dist[src] = 0;
        queue.add(src);

        while (!queue.isEmpty()) {
            int k = queue.remove();
            for (int i = 0; i < adjacent.get(k).size(); i++) {
                if (visited[adjacent.get(k).get(i)] == false) {
                    visited[adjacent.get(k).get(i)] = true;
                    dist[adjacent.get(k).get(i)] = dist[k] + 1;
                    pred[adjacent.get(k).get(i)] = k;
                    queue.add(adjacent.get(k).get(i));
                }
            }
        }
    }
}
