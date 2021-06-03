import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;

public class problem3 {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int size = Integer.valueOf(sc.nextLine());
        int edges = Integer.valueOf(sc.nextLine());
        LinkedList<LinkedList<Integer>> adj = new LinkedList<LinkedList<Integer>>();
        int countList[] = new int[size];
        for (int i = 0; i < size; i++) {
            adj.add(new LinkedList<Integer>());
        }
        int num = 0;
        while (sc.hasNextLine() && num < edges) {
            String[] uandv = sc.nextLine().split(" ");
            int u = Integer.valueOf(uandv[0]);
            int v = Integer.valueOf(uandv[1]);
            addEdge(adj, u, v);
            num++;
        }
        int x = Integer.valueOf(sc.nextLine());
        int participants = Integer.valueOf(sc.nextLine());
        int[] participant = new int[size];
        while (sc.hasNextLine()) {
            String[] uandv = sc.nextLine().split(" ");
            participant[Integer.valueOf(uandv[0])] = 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.print("Adjacency list of vertex " + i + "\nhead");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
        Queue queue = new LinkedList<>();
        queue.add(x);
        int visited[] = new int[size];
        visited[x] = 1;

        System.out.println(visit(adj, queue, visited, participant));
    }

    private static void addEdge(LinkedList<LinkedList<Integer>> adj, int u, int v) {
        adj.get(v).add(u);
    }

    public static int visit(LinkedList<LinkedList<Integer>> adj, Queue queue, int[] visited, int[] participant) {
        Queue level = new LinkedList<>();
        int lvl = 0;
        int up = 0;
        while (!queue.isEmpty()) {
            if (!level.isEmpty() && up == (int) level.peek()) {
                lvl++;
                level.remove();
                up = 0;
            }
            up++;
            int u = (int) queue.remove();
            level.add(adj.get(u).size());
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (visited[adj.get(u).get(i)] == 0) {
                    if (participant[visited[adj.get(u).get(i)]] == 1) {
                        return lvl;
                    }
                    visited[adj.get(u).get(i)] = 1;
                    queue.add(adj.get(u).get(i));
                }
            }
        }
        return lvl;
    }
}
