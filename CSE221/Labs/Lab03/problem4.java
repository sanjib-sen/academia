import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.io.File;

public class problem4 {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int size = Integer.valueOf(sc.nextLine());   // Getting the size of vertices
        int edges = Integer.valueOf(sc.nextLine());  // Total number of edges
        LinkedList<LinkedList<Integer>> adj = new LinkedList<LinkedList<Integer>>();
        for (int i = 0; i < size; i++) {
            adj.add(new LinkedList<Integer>());
        }
        while (sc.hasNextLine()) {
            String[] uandv = sc.nextLine().split(" ");
            int u = Integer.valueOf(uandv[0]);     // Input edges and store them in LinkedList
            int v = Integer.valueOf(uandv[1]);
            addEdge(adj, u, v);
        }

        for (int i = 0; i < size; i++) {   // For printing the Adjacency list of vertices.
            System.out.print("Adjacency list of vertex " + i + "\nhead");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
        int max = -1;   
        int maxPos = -1; // Max positon before Visiting the Points
        for (int i = 0; i < size; i++) {
            int count = 0;
            int visitedOrNot[] = new int[size];
            count = visit(adj, visitedOrNot, i, count);
            System.out.println("Person's can be killed from Position: " + i + " is: " + count);
            if (count > max) {
                max = count;
                maxPos = i;
            }
        }
        System.out.println("\nThe maximum number of Person can be killed from Position: " + maxPos);

    }

    private static void addEdge(LinkedList<LinkedList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }

    public static int visit(LinkedList<LinkedList<Integer>> adj, int[] visitedOrNot, int u, int count) {
        if (visitedOrNot[u] == 1 || adj.get(u).size() == 0) {
            System.out.println("Position " + u + " Visiting Done");
            return count;
        }
        visitedOrNot[u] = 1;
        count += 1;
        for (int i = 0; i < adj.get(u).size(); i++) {
            System.out.println("Going from " + u + " to " + adj.get(u).get(i));
            count = visit(adj, visitedOrNot, adj.get(u).get(i), count);
        }

        return count;
    }

}
