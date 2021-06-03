import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class lab02 {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int size = Integer.valueOf(sc.nextLine());
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(size);
        for (int i = 0; i < size; i++) {
            adj.add(new ArrayList<Integer>());
        }
        while (sc.hasNextLine()) {
            String[] uandv = sc.nextLine().split(", ");
            int u = Integer.valueOf(uandv[0]);
            int v = Integer.valueOf(uandv[1]);
            addEdge(adj, u, v);
            // System.out.println("U: " + u + " V: " + v);
        }

        for (int i = 0; i < size; i++) {
            System.out.print("Adjacency list of vertex " + i + "\nhead");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}
